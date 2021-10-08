import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double detergent = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pencilsPrice = pencils * 5.80;
        double markersPrice = markers * 7.20;
        double detergentsPrice = detergent * 1.20;

        double totalSum = pencilsPrice + markersPrice + detergentsPrice;

        double netSum = totalSum - ((totalSum * discount) / 100);

        System.out.printf("%.3f", netSum);

    }
}

