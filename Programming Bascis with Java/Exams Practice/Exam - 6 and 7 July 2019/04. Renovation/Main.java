import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double area = length * width * 4;
        double percentNew = (percent * 1.0) / 100;
        double excludedArea = percentNew * area;

        double paintingArea = Math.ceil(area - excludedArea);

        String input = scanner.nextLine();
        while (!("Tired!".equals(input))) {
            int liters = Integer.parseInt(input);

            paintingArea -= liters;

            if (paintingArea <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if ("Tired!".equals(input)) {
            System.out.printf("%.0f quadratic m left.%n", paintingArea);
        } else if (paintingArea == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(paintingArea));
        }

    }
}


