package impl9.stati;

import impl9.Player;
import impl9.TennisGame9;

public class ScoreState extends StateAbstract{

    public ScoreState(Player player1, Player player2, TennisGame9 context) {
        super(player1, player2, context);
    }

    @Override
    public void advance(String playerName) {
        boolean leadingPlayerScores = playerHandler.leadingPlayerScores(playerName);
        String gameScore = playerHandler.getGameSimplifiedScore();
        playerHandler.increasePlayerPoints(playerName);
        switch (gameScore){
            case "01":
                if(!leadingPlayerScores){
                    context.setCurrentState(context.getAllState());
                }
                else {} //else non serve perché si rimane in ScoreState
                break;
            case "02":
                break;
            case "03":
                if(leadingPlayerScores){
                    context.setCurrentState(context.getVictoryState());
                }
                break;
            case "12":
                if(!leadingPlayerScores){
                    context.setCurrentState(context.getAllState());
                }
                break;
            case "13":
                if(leadingPlayerScores){
                    context.setCurrentState(context.getVictoryState());
                }
                break;
            case "23":
                if(leadingPlayerScores){
                    context.setCurrentState(context.getVictoryState());
                } else {
                    context.setCurrentState(context.getDeuceState());
                }
                break;
        }
    }

    @Override
    public String getScore() {
        return scoreTranslator.translate(player1.getPoints()) + "-" + scoreTranslator.translate(player2.getPoints());
    }
}
