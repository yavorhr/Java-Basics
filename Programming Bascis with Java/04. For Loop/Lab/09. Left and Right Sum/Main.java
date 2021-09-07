import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            double leftNum = scanner.nextInt();
            leftSum += leftNum;
        }

        for (int i = 1; i <= n; i++) {
            double rightNum = scanner.nextInt();
            rightSum += rightNum;

        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }

    }
}

