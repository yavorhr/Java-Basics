import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double percent = 0;

        if (sales >= 0 && sales <= 500) {
            switch (city) {
                case "Sofia":
                    percent = 0.05 * sales;
                    break;
                case "Varna":
                    percent = 0.045 * sales;
                    break;
                case "Plovdiv":
                    percent = 0.055 * sales;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (sales > 500 && sales <= 1000) {
            switch (city) {
                case "Sofia":
                    percent = 0.07 * sales;
                    break;
                case "Varna":
                    percent = 0.075 * sales;
                    break;
                case "Plovdiv":
                    percent = 0.08 * sales;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (sales > 1000 && sales <= 10000) {
            switch (city) {
                case "Sofia":
                    percent = 0.08 * sales;
                    break;
                case "Varna":
                    percent = 0.1 * sales;
                    break;
                case "Plovdiv":
                    percent = 0.12 * sales;
                    break;
                default:
                    System.out.println("error");
            }
        } else if (sales > 10000) {
            switch (city) {
                case "Sofia":
                    percent = 0.12 * sales;
                    break;
                case "Varna":
                    percent = 0.13 * sales;
                    break;
                case "Plovdiv":
                    percent = 0.145 * sales;
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        if (percent > 0) {
            System.out.printf("%.2f", percent);
        }

    }
}
