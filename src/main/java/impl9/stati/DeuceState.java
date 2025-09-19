package impl9.stati;

import impl9.Player;
import impl9.TennisGame9;

public class DeuceState extends StateAbstract{

    public DeuceState(Player player1, Player player2, TennisGame9 context) {
        super(player1, player2, context);
    }

    @Override
    public void advance(String playerName) {
        playerHandler.increasePlayerPoints(playerName);
        context.setCurrentState(context.getAdvantageState());
    }

    @Override
    public String getScore() {
        return "Deuce";
    }
}
