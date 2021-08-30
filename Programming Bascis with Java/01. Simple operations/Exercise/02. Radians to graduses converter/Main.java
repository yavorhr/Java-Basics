import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());
        double grad = radian * 180 / Math.PI;

        System.out.printf("%.0f", grad);
    }
}
