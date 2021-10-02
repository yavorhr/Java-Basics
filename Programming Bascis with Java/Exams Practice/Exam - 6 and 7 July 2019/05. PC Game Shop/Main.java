import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < games; i++) {
            String name = scanner.nextLine();

            switch (name) {
                case "Hearthstone":
                    count1++;
                    break;
                case "Fornite":
                    count2++;
                    break;
                case "Overwatch":
                    count3++;
                    break;
                default:
                    count4++;
            }
        }

        double count1sales = (count1 * 1.0 / games) * 100;
        double count2sales = (count2 * 1.0 / games) * 100;
        double count3sales = (count3 * 1.0 / games) * 100;
        double count4sales = (count4 * 1.0 / games) * 100;

        System.out.printf("Hearthstone - %.2f%%%n", count1sales);
        System.out.printf("Fornite - %.2f%%%n", count2sales);
        System.out.printf("Overwatch - %.2f%%%n", count3sales);
        System.out.printf("Others - %.2f%%%n", count4sales);

    }
}
