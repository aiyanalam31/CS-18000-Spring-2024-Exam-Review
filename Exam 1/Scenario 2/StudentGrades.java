// import statements go here
import java.util.Scanner;
// JavaDoc goes here

/**
 * Scenario 2 -- The Grades
 *
 * This program inputs a number of students, names of each student, and the number of grades per student, then
 * calculates whether the student has passed or failed based on their class average.
 *
 * @author Aiyan Alam
 *
 * @version February 17, 2024
 */

public class StudentGrades {
    private static final double PASSING_THRESHOLD = 60.0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine();

        for(int i = 1; i <= numStudents; i++)
        {
            System.out.print("Enter name for student " + i + ": ");
            String studentName = input.nextLine();

            Student student = new Student(studentName, 3);  // Assuming 3 grades for each student
            student.inputGrades();
            student.displayResult(PASSING_THRESHOLD);
        }

    }
}
