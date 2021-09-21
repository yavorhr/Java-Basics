import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;

                if (number > n) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }

            System.out.println();
        }
    }
}
