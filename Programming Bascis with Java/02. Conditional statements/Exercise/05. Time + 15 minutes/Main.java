import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startHour = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());

        int timeIn15minutes = startHour * 60 + startMinutes + 15;
        int finalHour = timeIn15minutes / 60;
        int finalMinutes = timeIn15minutes % 60;

        if (finalHour == 24) {
            finalHour = 0;
        }

        if (finalMinutes < 10) {
            System.out.printf("%d:0%d", finalHour, finalMinutes);
        } else {
            System.out.printf("%d:%d", finalHour, finalMinutes);
        }

    }
}

