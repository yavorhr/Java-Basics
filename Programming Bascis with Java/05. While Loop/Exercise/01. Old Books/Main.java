import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        int libraryBooks = Integer.parseInt(scanner.nextLine());

        int checkedBooks = 0;
        boolean isFound = false;

        while (checkedBooks < libraryBooks) {
            String currentBook = scanner.nextLine();

            if (currentBook.equals(book)) {
                isFound = true;
                break;
            }
            checkedBooks++;
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", checkedBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checkedBooks);
        }

    }
}

