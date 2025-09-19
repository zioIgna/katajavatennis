package impl9.stati;

public interface State {
    void advance(String playerName);
    String getScore();
}
