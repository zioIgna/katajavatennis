package impl9.stati;

import impl9.Player;
import impl9.PlayerHandler;
import impl9.ScoreTranslator;
import impl9.TennisGame9;

import java.util.List;

public abstract class StateAbstract implements State {

    TennisGame9 context;
    Player player1;
    Player player2;
    PlayerHandler playerHandler;
    ScoreTranslator scoreTranslator;

    public StateAbstract(Player player1, Player player2, TennisGame9 context) {
        this.player1 = player1;
        this.player2 = player2;
        this.context = context;
        this.playerHandler = new PlayerHandler(List.of(player1, player2));
        this.scoreTranslator = new ScoreTranslator();
    }
}
