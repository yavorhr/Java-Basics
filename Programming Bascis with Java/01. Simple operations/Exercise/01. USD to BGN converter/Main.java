import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double BGN = 1.79549;
        double USD = Double.parseDouble(scanner.nextLine());

        double changeCourse = USD * BGN;

        System.out.printf("%.2f", changeCourse);

    }
}
