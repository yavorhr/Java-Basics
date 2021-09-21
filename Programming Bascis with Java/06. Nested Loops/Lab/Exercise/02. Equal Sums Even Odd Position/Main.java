import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            String currentNumber = Integer.toString(i);

            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < currentNumber.length(); j++) {
                if ((j + 1) % 2 == 0) {
                    evenSum += Character.getNumericValue(currentNumber.charAt(j));
                } else {
                    oddSum += Character.getNumericValue(currentNumber.charAt(j));
                }
            }

            if (evenSum == oddSum) {
                System.out.printf("%d ", i);
            }

        }
    }
}