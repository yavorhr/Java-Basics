import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intelligence = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        String bee = "";

        if (intelligence >= 80 && power >= 80 && gender.equals("female")) {
            bee = "Queen Bee";
        } else if (intelligence >= 80) {
            bee = "Repairing Bee";
        } else if (intelligence >= 60) {
            bee = "Cleaning Bee";
        } else if (power >= 80 && gender.equals("male")) {
            bee = "Drone Bee";
        } else if (power >= 60) {
            bee = "Guard Bee";
        } else {
            bee = "Worker Bee";
        }

        System.out.println(bee);
    }
}





