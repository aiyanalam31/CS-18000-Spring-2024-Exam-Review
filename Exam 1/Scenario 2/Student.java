import java.util.Scanner;
public class Student
{
    private String name;
    private double[] grades;

    public Student(String name, int numGrades)
    {
        this.name = name;
        this.grades = new double[numGrades];
    }

    public String getName()
    {
        return name;
    }

    public void inputGrades()
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++)
        {
            System.out.print("Enter grade " + (i + 1) + " for " + name + ": ");
            grades[i] = input.nextDouble();
            input.nextLine();
        }
    }

    public double calculateAverage()
    {
        double total = 0;
        for(double grade: grades)
        {
            total += grade;
        }
        return total/grades.length;
    }

    public void displayResult(double passingThreshold)
    {
        double average = calculateAverage();
        System.out.println("Average gade for " + name + ": " + average);

        if(average >= passingThreshold)
        {
            System.out.println(name + " has passed.\n");
        }
        else
        {
            System.out.println(name + " has failed.\n");
        }
    }
}
