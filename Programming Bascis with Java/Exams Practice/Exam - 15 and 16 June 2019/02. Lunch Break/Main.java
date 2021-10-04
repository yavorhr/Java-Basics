import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        double lunchBreak = Integer.parseInt(scanner.nextLine());

        double lunch = lunchBreak / 8;
        double rest = lunchBreak / 4;
        double time = Math.floor(lunchBreak - lunch - rest);

        if (durationEpisode <= time) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.abs(time - durationEpisode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.abs(time - durationEpisode));
        }

    }
}

