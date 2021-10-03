import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        int shoes = Integer.parseInt(scanner.nextLine());

        double rocketsCost = price * quantity;
        double shoesCost = (price / 6) * shoes;
        double rocketsAndShoes = rocketsCost + shoesCost;
        double others = rocketsAndShoes * 0.2;
        double allItmesCost = rocketsAndShoes + others;
        double netCost = Math.floor(allItmesCost / 8);
        double sponsors = Math.ceil(allItmesCost / 8 * 7);

        System.out.printf("Price to be paid by Djokovic %.0f%n", netCost);
        System.out.printf("Price to be paid by sponsors %.0f", sponsors);

    }
}

