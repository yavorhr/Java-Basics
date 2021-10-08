import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int p1 = 0; // Мусала
        int p2 = 0; // Монблан
        int p3 = 0; // Килиманджаро
        int p4 = 0; // К2
        int p5 = 0; // Еверест
        int allPeople = 0;

        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            allPeople += people;

            if (people <= 5) {
                p1 += people;
            } else if (people <= 12) {
                p2 += people;
            } else if (people <= 25) {
                p3 += people;
            } else if (people <= 40) {
                p4 += people;
            } else {
                p5 += people;
            }
        }

        System.out.printf("%.2f%%%n", (p1 * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (p2 * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (p3 * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (p4 * 1.0 / allPeople) * 100);
        System.out.printf("%.2f%%%n", (p5 * 1.0 / allPeople) * 100);
    }
}

