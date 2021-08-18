import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());
        double totalPrice = 7.61 * meters;
        double discount = totalPrice * 0.18;
        double finalPrice = totalPrice - discount;

        System.out.printf("The final price is: %.2f lv. %n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }

}
