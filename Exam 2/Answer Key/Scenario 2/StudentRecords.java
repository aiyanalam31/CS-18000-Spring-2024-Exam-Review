import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class StudentRecords {
    private ArrayList<Student> students;

    public StudentRecords() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(String name, double gpa) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setGpa(gpa);
                System.out.println("Student information updated: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(String name) 
    {
        for (Student student : students)
        {
            if (student.getName().equals(name))
            {
                students.remove(student);
                System.out.println("Student removed successfully!");
                break;
            }
            else
            {
                System.out.println("Student has not been found!");
            }
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in records.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public double calculateAverageGPA() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalGPA = 0.0;
        for (Student student : students) {
            totalGPA += student.getGpa();
        }
        return totalGPA / students.size();
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Student student : students) {
                writer.println(student.getName() + "," + student.getAge() + "," + student.getGpa());
            }
            System.out.println("Student records saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving student records to file.");
        }
    }
}