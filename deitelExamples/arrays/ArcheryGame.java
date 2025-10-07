
import java.util.Scanner;
import java.util.Random;

class ArcheryGame {

    public static void simulateGame(int plyCount, int[][] scores) {

        Random random = new Random();
        for (int i=0; i<plyCount; i++) {
            for (int j=0; j<3; j++) {
                scores[i][j] = random.nextInt(10) + 1;
            }
        }
    }

    public static void printScores(int[][] scores) {
        int players = scores.length;
        int winner = 0;
        int winsum = 0;
        int sum = 0;
        System.out.println("Scores: S1 S2 S3 Sum");
        for (int i=0; i<players; i++) {
            System.out.printf("%s%d %3d%3d%3d%4d%n", "Player", i+1, scores[i][0], 
                scores[i][1], scores[i][2], sum = scores[i][0] + scores[i][1] 
                + scores[i][2] );
            if (sum > winsum) {
                winsum = sum;
                winner = i+1;
            }
        }
        System.out.println("");
        System.out.println("Winner is: " + winner);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players = 0;

        System.out.print("Enter the number of players: ");
        boolean flag = true;
        while (true) {
            try {
                String input = scanner.nextLine();
                players = Integer.parseInt(input);
                flag = true;
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println("Please enter a number:");
                flag = false;
            }
            if (flag) 
                break;
        }
        scanner.close();
        if (players == 0) {
            System.out.println("No players selected, app quits");
            return;
        }

        int[][] scoreArray = new int[players][3]; 
        simulateGame(players, scoreArray);
        printScores(scoreArray);

    }

}