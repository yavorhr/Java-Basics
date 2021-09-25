import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPopulation = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= years; i++) {
            startPopulation = startPopulation + (startPopulation / 10) * 2;

            if (i % 5 == 0) {
                startPopulation = startPopulation - (startPopulation / 50) * 5;
            }

            startPopulation = startPopulation - (startPopulation / 20) * 2;
        }

        System.out.printf("Beehive population: %d", startPopulation);
    }
}
