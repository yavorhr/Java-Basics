import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int maxNumber = Integer.MIN_VALUE;

        while (n > counter) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxNumber) {
                maxNumber = number;
            }
            counter++;
        }

        System.out.println(maxNumber);
    }
}

