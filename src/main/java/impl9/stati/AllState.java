package impl9.stati;

import impl9.Player;
import impl9.TennisGame9;

public class AllState extends StateAbstract{

    public AllState(Player player1, Player player2, TennisGame9 context) {
        super(player1, player2, context);
    }

    @Override
    public void advance(String playerName) {
        playerHandler.increasePlayerPoints(playerName);
        context.setCurrentState(context.getScoreState());
    }

    @Override
    public String getScore(){
        return scoreTranslator.translate(player1.getPoints()).toString() + "-All";
    }
}
