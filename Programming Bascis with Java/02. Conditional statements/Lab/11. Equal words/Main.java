import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        if (firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

