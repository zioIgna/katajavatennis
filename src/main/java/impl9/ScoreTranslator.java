package impl9;

public class ScoreTranslator {
    public String translate(int score){
        String result = "";
        switch (score){
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
                break;
        }
        return result;
    }
}
