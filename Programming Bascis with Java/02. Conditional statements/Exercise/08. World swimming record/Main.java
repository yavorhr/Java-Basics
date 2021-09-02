import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secMeters = Double.parseDouble(scanner.nextLine());

        double time = distance * secMeters;
        double slow = Math.floor(distance / 15);

        double secSlow = slow * 12.5;

        double allTime = secSlow + time;

        if (allTime < record) {
            double diff = record - allTime;
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        } else {
            double secNeeded = allTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", secNeeded);
        }

    }
}