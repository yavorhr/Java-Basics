import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double volumeLiters = volume * 0.001;
        double percentNumber = percent * 0.01;
        double needLiters = volumeLiters * (1 - percentNumber);

        System.out.printf("%.3f", needLiters);
    }
}
