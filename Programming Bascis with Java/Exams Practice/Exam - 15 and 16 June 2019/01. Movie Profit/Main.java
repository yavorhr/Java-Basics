import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTickets = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double profit = (tickets * priceTickets) * days;
        double cinemaProfit = (percent / 100) * profit;
        double netProfit = profit - cinemaProfit;

        System.out.printf("The profit from the movie %s is %.2f lv.", movie, netProfit);

    }
}
