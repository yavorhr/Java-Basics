import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String destination = scanner.nextLine();
        String reservationsDates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (destination) {
            case "France":
                if (reservationsDates.equals("21-23")) {
                    price = nights * 30;
                } else if (reservationsDates.equals("24-27")) {
                    price = nights * 35;
                } else if (reservationsDates.equals("28-31")) {
                    price = nights * 40;
                }
                break;

            case "Italy":
                if (reservationsDates.equals("21-23")) {
                    price = nights * 28;
                } else if (reservationsDates.equals("24-27")) {
                    price = nights * 32;
                } else if (reservationsDates.equals("28-31")) {
                    price = nights * 39;
                }
                break;
            case "Germany":
                if (reservationsDates.equals("21-23")) {
                    price = nights * 32;
                } else if (reservationsDates.equals("24-27")) {
                    price = nights * 37;
                } else if (reservationsDates.equals("28-31")) {
                    price = nights * 43;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, price);
    }
}

