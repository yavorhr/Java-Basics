import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                for (int third = 1; third <= 9; third++) {
                    for (int four = 1; four <= 9; four++) {
                        boolean check1 = n % first == 0;
                        boolean check2 = n % second == 0;
                        boolean check3 = n % third == 0;
                        boolean check4 = n % four == 0;

                        if (check1 && check2 && check3 && check4) {
                            System.out.printf("%d%d%d%d ", first, second, third, four);
                        }
                    }

                }
            }
        }

    }
}