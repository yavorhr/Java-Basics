import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standardCount = 0;
        int kidCount = 0;
        int studentCount = 0;

        String movie = scanner.nextLine();

        while (!("Finish".equals(movie))) {
            int soldTickets = 0;
            int capacity = Integer.parseInt(scanner.nextLine());

            while (capacity != 0) {
                String ticket = scanner.nextLine();
                if ("End".equals(ticket)) {
                    break;
                }

                soldTickets++;

                switch (ticket) {
                    case "student":
                        studentCount++;
                        capacity--;
                        break;
                    case "standard":
                        standardCount++;
                        capacity--;
                        break;
                    case "kid":
                        kidCount++;
                        capacity--;
                        break;
                }
            }

            System.out.printf("%s - %.2f%% full.%n", movie, (soldTickets * 1.0 / (capacity + soldTickets)) * 100);
            movie = scanner.nextLine();
        }

        int allSoldTickets = standardCount + kidCount + studentCount;
        System.out.printf("Total tickets: %d%n", allSoldTickets);
        System.out.printf("%.2f%% student tickets.%n", (studentCount * 1.0 / allSoldTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (standardCount * 1.0 / allSoldTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (kidCount * 1.0 / allSoldTickets) * 100);
    }
}
