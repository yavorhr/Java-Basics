import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (currentNum > max) {
                max = currentNum;
            }
        }

        sum = sum - max;
        if (sum == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            int diff = sum - max;
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(diff));
        }

    }
}

