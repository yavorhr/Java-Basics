import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double kozunaci = kozunak * 3.20;
        double eggsTotal = eggs * 4.35 + (eggs * 12 * 0.15);
        double cookiesTotal = cookies * 5.40;

        double totalPrice = kozunaci + eggsTotal + cookiesTotal;

        System.out.printf("%.2f", totalPrice);

    }
}

