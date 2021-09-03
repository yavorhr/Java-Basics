import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hourExam = Integer.parseInt(reader.readLine());
        int minExam = Integer.parseInt(reader.readLine());
        int hourArrived = Integer.parseInt(reader.readLine());
        int minArrived = Integer.parseInt(reader.readLine());

        int examTime = (hourExam * 60) + minExam;
        int arrivalTime = (hourArrived * 60) + minArrived;
        int difference = examTime - arrivalTime;

        if (difference > 30) {
            System.out.println("Early");

            if (difference > 59) {
                int hours = difference / 60;
                int mins = difference % 60;
                System.out.printf("%d:%02d hours before the start", hours, mins);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        } else if (difference < 0) {
            System.out.println("Late");
            int minsLate = Math.abs(difference);
            if (minsLate > 59) {
                int hours = minsLate / 60;
                int mins = minsLate % 60;
                System.out.printf("%d:%02d hours after the start", hours, mins);
            } else {
                System.out.printf("%d minutes after the start", minsLate);
            }
        } else {
            System.out.println("On time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        }

    }
}