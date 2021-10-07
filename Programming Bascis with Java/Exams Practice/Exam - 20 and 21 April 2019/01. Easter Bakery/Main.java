import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double floursKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int maya = Integer.parseInt(scanner.nextLine());

        double flour = flourPrice * floursKg;
        double sugarPrice = (0.75 * flourPrice);
        double sugarTotal = sugarKg * sugarPrice;
        double eggsPrice = eggs * (1.10 * flourPrice);
        double mayaPrice = maya * (0.2 * sugarPrice);

        double priceTotal = flour + sugarTotal + eggsPrice + mayaPrice;
        System.out.printf("%.2f", priceTotal);
    }
}

