import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int k = 1;

        for (int i = 0; i <= n; i += 2) {
            System.out.println(k);

            k = k * 2 * 2;
        }

    }
}
