package impl9.stati;

import impl9.Player;
import impl9.TennisGame9;

public class VictoryState extends StateAbstract{

    public VictoryState(Player player1, Player player2, TennisGame9 context) {
        super(player1, player2, context);
    }

    @Override
    public void advance(String playerName) {

    }

    @Override
    public String getScore() {
        return "Win for " + playerHandler.getLeadingPlayer().getName();
    }
}
