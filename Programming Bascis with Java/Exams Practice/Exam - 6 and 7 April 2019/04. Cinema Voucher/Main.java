import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        int purchasePrice = 0;
        int sum = 0;
        int movie = 0;
        int product = 0;


        String input = scanner.nextLine();
        while (!("End".equals(input))) {
            String purchase = input;
            int length = purchase.length();

            char symbolFirstLetter = purchase.charAt(0);
            char symbolSecondLetter = purchase.charAt(1);

            int asciiFirstLetter;
            asciiFirstLetter = (int) symbolFirstLetter;
            int asciiSecondLetter;
            asciiSecondLetter = (int) symbolSecondLetter;

            if (length > 8) {
                purchasePrice = asciiFirstLetter + asciiSecondLetter;
                if (voucher - purchasePrice >= 0) {
                    movie++;
                }
            } else {
                purchasePrice = asciiFirstLetter;
                if (voucher - purchasePrice > 0) {
                    product++;
                }
            }
            voucher -= purchasePrice;

            if (voucher <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        System.out.println(movie);
        System.out.println(product);
    }
}

