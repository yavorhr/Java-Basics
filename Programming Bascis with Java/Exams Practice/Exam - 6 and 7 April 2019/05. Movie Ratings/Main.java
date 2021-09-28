import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        double avgRating = 0;

        String bestMovie = "";
        String worstMovie = "";

        for (int i = 0; i < n; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            avgRating += rating;

            if (rating > maxRating) {
                maxRating = rating;
                bestMovie = movie;
            }

            if (rating < minRating) {
                minRating = rating;
                worstMovie = movie;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n", bestMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", worstMovie, minRating);
        System.out.printf("Average rating: %.1f", avgRating / n);
    }
}
