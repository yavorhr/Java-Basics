import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinema = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0.0;

        if (cinema.equals("Premiere")) {
            income = rows * columns * 12;
        } else if (cinema.equals("Normal")) {
            income = rows * columns * 7.50;
        } else if (cinema.equals("Discount")) {
            income = rows * columns * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}
