package impl9;

import java.util.Comparator;
import java.util.List;

public class PlayerHandler {
    List<Player> players;

    public PlayerHandler(List<Player> players) {
        this.players = players;
    }

    public Player getSelectedPlayer(String playerName){
        return players.stream().filter(p -> p.getName().equals(playerName)).findFirst().orElse(null);
    }

    public Player getLeadingPlayer(){
        return players.stream().sorted(Comparator.comparingInt(Player::getPoints).reversed()).findFirst().orElse(null);
    }

    public Player getTrailingPlayer(){
        return players.stream().sorted(Comparator.comparingInt(Player::getPoints)).findFirst().orElse(null);
    }

    public void increasePlayerPoints(String playerName){
        Player selectedPlayer = getSelectedPlayer(playerName);
        selectedPlayer.setPoints(selectedPlayer.getPoints() + 1);
    }

    public boolean leadingPlayerScores(String playerName){
        Player selectedPlayer = getSelectedPlayer(playerName);
        return selectedPlayer.equals(getLeadingPlayer());
    }

    public String getGameSimplifiedScore(){
        List<Player> orderedPlayers = players.stream().sorted(Comparator.comparingInt(Player::getPoints)).toList();
        String result = "";
        for(Player player : orderedPlayers){
            result += player.getPoints();
        }
        return result;
    }
}