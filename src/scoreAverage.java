import java.util.Scanner;
public class scoreAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int scoreCounter = 1;

        while (scoreCounter <= 6) {
            System.out.print("Enter score: ");
            int score = input.nextInt();

            total = total + score;
            scoreCounter = scoreCounter + 1;
        }

        double average = total / 6;
        System.out.printf("%nTotal of students score is %d%n", total);

        System.out.printf("Class average is %.2f%n", average);

    }

}