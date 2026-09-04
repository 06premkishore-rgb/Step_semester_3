package week_1.class_problems;
import java.util.Random;

public class RockPaperScissors {

    static final String[] MOVES = {Rock, Paper, Scissors};

    public static void main(String[] args) {
        int n = 5;
        String[] playerMoves = {Rock, Paper, Scissors, Rock, Paper};  predefined for demo
        String[] results = new String[n];
        String[] computerMoves = new String[n];

        int wins = 0, losses = 0, draws = 0;
        Random rand = new Random();

        for (int i = 0; i  n; i++) {
            computerMoves[i] = MOVES[rand.nextInt(3)];
            results[i] = playRound(playerMoves[i], computerMoves[i]);

            if (results[i].equals(Player Wins)) wins++;
            else if (results[i].equals(Computer Wins)) losses++;
            else draws++;
        }

        System.out.printf(%-8s %-15s %-15s %-15s%n, Round, Player Move, Computer Move, Result);
        for (int i = 0; i  n; i++) {
            System.out.printf(%-8d %-15s %-15s %-15s%n, (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }

        double winPercentage = (wins  100.0)  n;
        System.out.println();
        System.out.printf(Wins %d  Losses %d  Draws %d  Win %% = %.1f%%%n, wins, losses, draws, winPercentage);
    }

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return Draw;

        if ((playerMove.equals(Rock) && computerMove.equals(Scissors)) 
            (playerMove.equals(Paper) && computerMove.equals(Rock)) 
            (playerMove.equals(Scissors) && computerMove.equals(Paper))) {
            return Player Wins;
        }
        return Computer Wins;
    }
}