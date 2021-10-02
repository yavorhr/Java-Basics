import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double deckChairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allEntryTax = people * entryTax; // 115.50
        double allDeckChairPrice = Math.ceil(people * 0.75) * deckChairPrice;

        double allUmbrellaPrice = Math.ceil(people * 0.50) * umbrellaPrice;
        double budget = allEntryTax + allDeckChairPrice + allUmbrellaPrice;
        System.out.printf("%.2f lv.", budget);
    }
}