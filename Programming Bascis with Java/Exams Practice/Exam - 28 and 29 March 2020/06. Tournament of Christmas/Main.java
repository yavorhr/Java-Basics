import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allMoney = 0;
        int winningDays = 0;
        int daysLost = 0;

        for (int i = 0; i < days; i++) {

            int winCount = 0;
            int loseCount = 0;
            double money = 0;

            String sportGame = scanner.nextLine();
            while (!("Finish".equals(sportGame))) {
                String result = scanner.nextLine();
                switch (result) {
                    case "win":
                        money += 20;
                        winCount++;
                        break;
                    case "lose":
                        loseCount++;
                        break;
                }
                sportGame = scanner.nextLine();
            }

            if (winCount > loseCount) {
                money = money + money * 0.1;
                winningDays++;
                allMoney += money;
            } else if (loseCount > winCount) {
                daysLost++;
                allMoney += money;
            }
        }

        if (winningDays > daysLost) {
            allMoney = allMoney + (0.2 * allMoney);
            System.out.printf("You won the tournament! Total raised money: %.2f", allMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allMoney);
        }

    }
}
