import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 0; i < visitors; i++) {
            String action = scanner.nextLine();     // ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")

            switch (action) {
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
            }
        }
        double trainingPeople = back + chest + legs + abs;
        double customers = proteinBar + proteinShake;

        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", trainingPeople / visitors * 100);
        System.out.printf("%.2f%% - protein", customers / visitors * 100);
    }
}

