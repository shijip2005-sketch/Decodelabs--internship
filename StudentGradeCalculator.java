import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter Marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                marks = sc.nextInt();
            }

            total += marks;
        }

        double average = (double) total / subjects;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n===== STUDENT GRADE REPORT =====");
        System.out.println("Student Name      : " + name);
        System.out.println("Number of Subjects: " + subjects);
        System.out.println("Total Marks       : " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade             : " + grade);

        sc.close();
    }
}