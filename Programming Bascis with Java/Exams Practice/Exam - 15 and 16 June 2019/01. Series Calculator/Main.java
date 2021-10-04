import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String show = scanner.nextLine();
        int season = Integer.parseInt(scanner.nextLine());
        int episode = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());

        double time = season * episode * duration;
        double commercial = (0.2 * duration) * episode * season;
        double extraEpisode = season * 10;
        double totalTime = time + commercial + extraEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", show, totalTime);

    }
}

