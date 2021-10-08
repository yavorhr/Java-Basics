import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalking = Integer.parseInt(scanner.nextLine());
        int walksAday = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalCaloriesBurned = walksAday * (minutesWalking * 5);

        if (totalCaloriesBurned >= calories * 0.5) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalCaloriesBurned);
        } else {
            System.out.printf(" No, the walk for your cat is not enough. Burned calories per day: %d.", totalCaloriesBurned);
        }

    }
}

