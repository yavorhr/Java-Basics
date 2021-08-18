import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int restAnimals = Integer.parseInt(scanner.nextLine());

        double foodDogs = dogs * 2.50;
        double foodRestAnimals = restAnimals * 4.0;

        double totalFood = foodDogs + foodRestAnimals;

        System.out.printf("%.2f lv.", totalFood);
    }

}
