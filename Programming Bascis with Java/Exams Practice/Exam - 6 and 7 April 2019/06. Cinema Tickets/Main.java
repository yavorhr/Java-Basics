import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsTickets = 0;
        int standardsTickets = 0;
        int kidsTickets = 0;

        int totalTickets = 0;

        String movie = scanner.nextLine();
        while (!("Finish").equals(movie)) {
            int capacity = Integer.parseInt(scanner.nextLine());
            int counter = 0;

            String input = scanner.nextLine();
            while (!("End".equals(input))) {
                String ticket = input;
                switch (ticket) {
                    case "student":
                        studentsTickets++;
                        counter++;
                        capacity--;
                        break;
                    case "standard":
                        standardsTickets++;
                        counter++;
                        capacity--;
                        break;
                    case "kid":
                        kidsTickets++;
                        counter++;
                        capacity--;
                        break;
                }

                if (capacity == 0) {
                    break;
                }
                input = scanner.nextLine();
            }

            totalTickets += counter;

            double averageCapacity = (counter * 1.0 / (capacity + counter)) * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, averageCapacity);

            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", ((studentsTickets * 1.0) / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", ((standardsTickets * 1.0) / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", ((kidsTickets * 1.0) / totalTickets) * 100);

    }
}

