import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetHoney = Double.parseDouble(scanner.nextLine());
        double totalHoney = 0;

        String bee = scanner.nextLine();
        while (!("Winter has come".equals(bee))) {

            double sumBeeHoney = 0;

            for (int i = 0; i < 6; i++) {
                double currentHoney = Double.parseDouble(scanner.nextLine());
                sumBeeHoney += currentHoney;
            }
            if (sumBeeHoney < 0) {
                System.out.printf("%s was banished for gluttony%n", bee);
            }
            totalHoney += sumBeeHoney;
            if (totalHoney >= targetHoney) {
                break;
            }
            bee = scanner.nextLine();
        }

        if (targetHoney > totalHoney) {
            System.out.printf("Hard Winter! Honey needed %.2f.", targetHoney - totalHoney);
        } else {
            System.out.printf("Well done! Honey surplus %.2f.", totalHoney - targetHoney);
        }

    }
}

