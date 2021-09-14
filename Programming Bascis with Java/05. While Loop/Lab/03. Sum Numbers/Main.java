import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);
            sum += currentNum;

            input = scanner.nextLine();
        }

        System.out.println(sum);
    }
}
