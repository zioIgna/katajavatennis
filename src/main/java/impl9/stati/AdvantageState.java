package impl9.stati;

import impl9.Player;
import impl9.TennisGame9;

public class AdvantageState extends StateAbstract{

    public AdvantageState(Player player1, Player player2, TennisGame9 context) {
        super(player1, player2, context);
    }

    @Override
    public void advance(String playerName) {
        playerHandler.increasePlayerPoints(playerName);
        if(playerHandler.leadingPlayerScores(playerName)){
            context.setCurrentState(context.getVictoryState());
        } else {
            context.setCurrentState(context.getDeuceState());
        }
    }

    @Override
    public String getScore() {
        return "Advantage " + playerHandler.getLeadingPlayer().getName();
    }
}
