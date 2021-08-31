import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        switch (figure) {
            case "square" -> {
                double side = Double.parseDouble(scanner.nextLine());
                double area = side * side;
                System.out.printf("%.3f", area);
            }
            case "rectangle" -> {
                double sideA = Double.parseDouble(scanner.nextLine());
                double sideB = Double.parseDouble(scanner.nextLine());
                double areaRectangle = sideA * sideB;
                System.out.printf("%.3f", areaRectangle);
            }
            case "circle" -> {
                double radius = Double.parseDouble(scanner.nextLine());
                double areaCircle = Math.PI * radius * radius;
                System.out.printf("%.3f", areaCircle);
            }
            case "triangle" -> {
                double sideA = Double.parseDouble(scanner.nextLine());
                double heightA = Double.parseDouble(scanner.nextLine());
                double triangleArea = 0.5 * sideA * heightA;
                System.out.printf("%.3f", triangleArea);
            }
        }
    }
}
