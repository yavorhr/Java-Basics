import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int noPrimeSum = 0;
        String input = scanner.nextLine();

        while (!("stop".equals(input))) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = false;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                primeSum = primeSum + num;
            } else {
                noPrimeSum = noPrimeSum + num;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", noPrimeSum);
    }
}

