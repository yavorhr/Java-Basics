import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentsPrice = 0.0;

        switch (month) {
            case "May":
                studioPrice = nights * 50;
                apartmentsPrice = nights * 65;
                if (nights > 14) {
                    studioPrice = studioPrice * 0.7;
                    apartmentsPrice = apartmentsPrice * 0.9;
                } else if (nights > 7) {
                    studioPrice = studioPrice * 0.95;
                }
                break;
            case "June":
                studioPrice = nights * 75.20;
                apartmentsPrice = nights * 68.70;
                if (nights > 14) {
                    studioPrice = studioPrice * 0.8;
                    apartmentsPrice = apartmentsPrice * 0.9;
                }
                break;
            case "July":
                studioPrice = nights * 76;
                apartmentsPrice = nights * 77;
                if (nights > 14) {
                    apartmentsPrice = apartmentsPrice * 0.9;
                }
                break;
            case "August":
                studioPrice = nights * 76;
                apartmentsPrice = nights * 77;

                if (nights > 14) {
                    apartmentsPrice = apartmentsPrice * 0.9;
                }
                break;
            case "September":
                studioPrice = nights * 75.20;
                apartmentsPrice = nights * 68.70;
                if (nights > 14) {
                    studioPrice = studioPrice * 0.8;
                    apartmentsPrice = apartmentsPrice * 0.9;
                }
                break;
            case "October":
                studioPrice = nights * 50;
                apartmentsPrice = nights * 65;
                if (nights > 14) {
                    studioPrice = studioPrice * 0.7;
                    apartmentsPrice = apartmentsPrice * 0.9;
                } else if (nights > 7) {
                    studioPrice = studioPrice * 0.95;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentsPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}

