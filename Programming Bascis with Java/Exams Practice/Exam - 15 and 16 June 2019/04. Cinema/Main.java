import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        double profit = 0;
        double totalProfit = 0;

        String input = scanner.nextLine();
        while (!("Movie time!".equals(input))) {
            int people = Integer.parseInt(input);

            profit = people * 5;

            if (people % 3 == 0) {
                profit -= 5;
            }
            if (people > capacity) {
                break;
            }

            capacity = capacity - people;

            totalProfit += profit;

            input = scanner.nextLine();
        }

        if ("Movie time!".equals(input)) {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
            System.out.printf("Cinema income - %.0f lv.", totalProfit);
        } else {
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %.0f lv.", totalProfit);
        }

    }
}



