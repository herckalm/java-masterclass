package methods.exercises;

public class HighScores {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHigScorePosition(1200));
        displayHighScorePosition("Bob", calculateHigScorePosition(700));
        displayHighScorePosition("Lisa", calculateHigScorePosition(480));
        displayHighScorePosition("Karen", calculateHigScorePosition(70));
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.print(playerName + " managed to get into position " + highScorePosition + " on the high score list!\n");
    }

    public static int calculateHigScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}
