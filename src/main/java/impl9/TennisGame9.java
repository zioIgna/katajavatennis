package impl9;

import impl9.stati.*;

import java.util.List;

public class TennisGame9 implements TennisGame{

    Player player1;
    Player player2;

    State allState;
    State scoreState;
    State deuceState;
    State advantageState;
    State victoryState;

    State currentState;

    public TennisGame9(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
        allState = new AllState(this.player1, this.player2, this);
        scoreState = new ScoreState(this.player1, this.player2, this);
        deuceState = new DeuceState(this.player1, this.player2, this);
        advantageState = new AdvantageState(this.player1, this.player2, this);
        victoryState = new VictoryState(this.player1, this.player2, this);

        currentState = allState;
    }

    // region Getter e Setter
    public State getAllState() {
        return allState;
    }

    public void setAllState(State allState) {
        this.allState = allState;
    }

    public State getScoreState() {
        return scoreState;
    }

    public void setScoreState(State scoreState) {
        this.scoreState = scoreState;
    }

    public State getDeuceState() {
        return deuceState;
    }

    public void setDeuceState(State deuceState) {
        this.deuceState = deuceState;
    }

    public State getAdvantageState() {
        return advantageState;
    }

    public void setAdvantageState(State advantageState) {
        this.advantageState = advantageState;
    }

    public State getVictoryState() {
        return victoryState;
    }

    public void setVictoryState(State victoryState) {
        this.victoryState = victoryState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    // endregion

    @Override
    public void wonPoint(String playerName) {
        currentState.advance(playerName);
    }

    @Override
    public String getScore() {
        return currentState.getScore();
    }
}
