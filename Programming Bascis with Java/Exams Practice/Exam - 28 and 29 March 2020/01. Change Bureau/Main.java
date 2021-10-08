import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yoan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsPrice = bitcoins * 1168;
        double yoanUSD = yoan * 0.15;
        double yoanBGN = yoanUSD * 1.76;
        double allInBGN = bitcoinsPrice + yoanBGN;


        double allEuro = allInBGN / 1.95;
        commission = (commission / 100) * allEuro;

        double restMoney = allEuro - commission;

        System.out.printf("%.2f", restMoney);

    }
}

