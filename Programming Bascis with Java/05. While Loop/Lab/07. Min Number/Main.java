import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int minNumber = Integer.MAX_VALUE;

        while (n > counter) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < minNumber) {
                minNumber = number;
            }
            counter++;
        }

        System.out.println(minNumber);
    }
}

