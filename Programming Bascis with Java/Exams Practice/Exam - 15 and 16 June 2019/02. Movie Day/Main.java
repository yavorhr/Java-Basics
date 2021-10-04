import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int duration = Integer.parseInt(scanner.nextLine());

        double prepTime = 0.15 * time;
        double recordTime = scenes * duration;
        double totalTime = prepTime + recordTime;

        double diff = Math.abs(totalTime - time);

        if (time >= totalTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", diff);
        }

    }
}
