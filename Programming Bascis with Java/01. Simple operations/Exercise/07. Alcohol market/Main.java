import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLiters = Double.parseDouble(scanner.nextLine());
        double wineLiters = Double.parseDouble(scanner.nextLine());
        double rakiaLiters = Double.parseDouble(scanner.nextLine());
        double whiskeyLiters = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = whiskeyPrice / 2;
        double winePrice = rakiaPrice - 0.4 * rakiaPrice;
        double beerPrice = rakiaPrice - 0.8 * rakiaPrice;

        double whiskeyCost = whiskeyPrice * whiskeyLiters;
        double beerCost = beerLiters * beerPrice;
        double wineCost = wineLiters * winePrice;
        double rakiaCost = rakiaLiters * rakiaPrice;

        double total = wineCost + beerCost + whiskeyCost + rakiaCost;

        System.out.printf("%.2f", total);
    }
}
