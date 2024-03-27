import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");

        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();

        int total_M = 0;
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            total_M += marks;
        }

        double Ave_P = (double) total_M / numSub;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total_M);
        System.out.println("Average Percentage: " + Ave_P);

        String grade = cal_Grade(Ave_P);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String cal_Grade(double Ave_P) {
        if (Ave_P >= 90) {
            return "A+";
        } else if (Ave_P >= 80) {
            return "A";
        } else if (Ave_P >= 70) {
            return "B";
        } else if (Ave_P >= 60) {
            return "C";
        } else if (Ave_P >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
