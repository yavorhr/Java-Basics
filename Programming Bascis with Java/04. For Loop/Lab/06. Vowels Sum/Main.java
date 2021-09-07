import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            switch (symbol) {
                case 'a' -> sum = sum + 1;
                case 'e' -> sum = sum + 2;
                case 'i' -> sum = sum + 3;
                case 'o' -> sum = sum + 4;
                case 'u' -> sum = sum + 5;
            }
        }

        System.out.println(sum);
    }
}
