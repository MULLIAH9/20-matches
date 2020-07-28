import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwentyMatches {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            ConsolePrint.greetings();
            String answer = reader.readLine();
            if (answer.equals("N")){
                continue;
            } else if (answer.equals("Y")) {
                break;
            }
        }
        int numOfRound = 1;

        ConsolePrint.enter();
        ConsolePrint.startGame();
        ConsolePrint.enter();
        System.out.println(numOfRound + " round:");
        computerTakes = 3;
        System.out.println("Computer's turn: Computer takes " + computerTakes);
        allMatches -= computerTakes;
        System.out.println("It is " + (allMatches) + " matches left");

        while (allMatches > 0){
            System.out.print("Player's turn: Player takes ");
            int playerTakes = Integer.parseInt(reader.readLine());

                while (true) {
                    if (playerTakes > 3) {
                        System.out.println("HAHAHA, Cheater! Chose between 1 to 3 ");
                        playerTakes = Integer.parseInt(reader.readLine());
                    } else break;
                }

            allMatches -= playerTakes;
            if (allMatches == 0){
                break;
            }
            System.out.println("It is " + (allMatches) + " matches left");
            ConsolePrint.enter();
            numOfRound++;
            System.out.println(numOfRound + " round:");
            computerTakes = 4 - playerTakes;
            System.out.println("Computer's turn: Computer takes " + computerTakes);
            allMatches -= computerTakes;
            System.out.println("It is " + (allMatches) + " matches left");
        }
        System.out.println("Computer win, human sucks .!. ");
    }
    public static int allMatches = 20;
    public static int computerTakes;
}
