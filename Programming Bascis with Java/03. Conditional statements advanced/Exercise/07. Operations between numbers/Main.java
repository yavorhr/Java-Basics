import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = N1 + N2;
                System.out.printf("%d %c %d = %.0f - ", N1, operation, N2, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case '-':
                result = N1 - N2;
                System.out.printf("%d %c %d = %.0f - ", N1, operation, N2, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case '*':
                result = N1 * N2;
                System.out.printf("%d %c %d = %.0f - ", N1, operation, N2, result);
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;
            case '/':
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = (double) N1 / N2;
                    System.out.printf("%d %c %d = %.2f", N1, operation, N2, result);
                }
                break;
            case '%':
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = N1 % N2;
                    System.out.printf("%d %c %d = %.0f", N1, operation, N2, result);
                }
                break;
        }

    }
}
