import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaPerOneCover = (length + 2 * 0.30) * (width + 2 * 0.30);
        double areaPerOneSquare = (length / 2) * (length / 2);

        double areaCovers = tables * areaPerOneCover;
        double areaSquares = tables * areaPerOneSquare;

        double priceCovers = areaCovers * 7;
        double priceSquares = areaSquares * 9;
        double total = priceCovers + priceSquares;
        double totalInBGN = total * 1.85;

        System.out.printf("%.2f USD%n", total);
        System.out.printf("%.2f BGN", totalInBGN);

    }
}

