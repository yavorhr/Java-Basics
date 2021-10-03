import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();

        int playerOnePoints = 0;
        int playerTwoPoints = 0;

        String input;
        while (true) {
            input = scanner.nextLine();
            if (("End of game".equals(input))) {
                System.out.printf("%s has %d points%n", playerOne, playerOnePoints);
                System.out.printf("%s has %d points", playerTwo, playerTwoPoints);
                break;
            }

            int cardPlayerOne = Integer.parseInt(input);
            input = scanner.nextLine();
            int cardPlayerTwo = Integer.parseInt(input);

            if (cardPlayerOne > cardPlayerTwo) {
                playerOnePoints += cardPlayerOne - cardPlayerTwo;
            } else if (cardPlayerTwo > cardPlayerOne) {
                playerTwoPoints += cardPlayerTwo - cardPlayerOne;
            } else {
                System.out.println("Number wars!");
                input = scanner.nextLine();
                cardPlayerOne = Integer.parseInt(input);
                input = scanner.nextLine();
                cardPlayerTwo = Integer.parseInt(input);
                if (cardPlayerOne > cardPlayerTwo) {
                    System.out.printf("%s is winner with %d points", playerOne, playerOnePoints);
                } else {
                    System.out.printf("%s is winner with %d points", playerTwo, playerTwoPoints);
                }
                break;
            }
        }

    }
}

