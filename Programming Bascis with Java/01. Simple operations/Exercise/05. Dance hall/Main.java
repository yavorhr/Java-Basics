import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double sideA = Double.parseDouble(scanner.nextLine());

        double hallArea = (width * 100) * (length * 100);
        double wardrobeArea = (sideA * 100) * (sideA * 100);
        double benchArea = hallArea / 10;

        double freeSpace = hallArea - wardrobeArea - benchArea;
        double dancers = freeSpace / 7040;

        System.out.printf("%.0f", Math.floor(dancers));
    }
}
