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

    public TennisGame9(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        allState = new AllState(player1, player2, this);
        scoreState = new ScoreState(player1, player2, this);
        deuceState = new DeuceState(player1, player2, this);
        advantageState = new AdvantageState(player1, player2, this);
        victoryState = new VictoryState(player1, player2, this);

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
        return "";
    }
}
