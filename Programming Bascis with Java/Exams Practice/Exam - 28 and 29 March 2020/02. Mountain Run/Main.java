import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecordTime = Double.parseDouble(scanner.nextLine());
        double worldRecordDistance = Double.parseDouble(scanner.nextLine());
        double georgeTimeFor1meter = Double.parseDouble(scanner.nextLine());

        double georgeTime = georgeTimeFor1meter * worldRecordDistance;
        double slow = Math.floor(worldRecordDistance / 50);
        double totalTime = georgeTime + slow * 30;

        if (totalTime < worldRecordTime) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - worldRecordTime);
        }

    }
}


