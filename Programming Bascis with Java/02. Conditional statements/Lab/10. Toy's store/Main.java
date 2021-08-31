import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = (puzzles * 2.6) + (talkingDolls * 3) + (teddyBears * 4.1) + (minions * 8.2) + (trucks * 2);
        int count = puzzles + talkingDolls + teddyBears + minions + trucks;

        double discount = 0;

        if (count >= 50) {
            discount = sum * 0.25;
        }

        double profit = sum - discount;
        double rent = profit * 0.1;

        double totalProfit = sum - discount - rent;


        if (totalProfit >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(tripPrice - totalProfit));
        }
    }
}

