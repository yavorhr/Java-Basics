import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if (input.equals("mm")) {
            value /= 1000;
        } else if (input.equals("cm")) {
            value /= 100;
        }

        if (output.equals("mm")) {
            value *= 1000;
        } else if (output.equals("cm")) {
            value *= 100;
        }

        System.out.printf("%.3f", value);
    }
}

