package impl9;

public class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
