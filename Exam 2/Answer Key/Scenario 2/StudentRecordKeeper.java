public class StudentRecordKeeper 
{
    public static void main(String[] args) {
        StudentRecords records = new StudentRecords();

        // Adding sample student records
        records.addStudent(new Student("Alice", 20, 3.5));
        records.addStudent(new Student("Bob", 21, 3.8));
        records.addStudent(new Student("Charlie", 19, 3.2));

        // Displaying initial student records
        records.displayStudents();

        // Updating a student's GPA
        records.updateStudent("Bob", 4.0);

        // Deleting a student record
        records.deleteStudent("Charlie");

        // Displaying updated student records
        records.displayStudents();

        // Calculating and displaying average GPA
        System.out.println("Average GPA: " + records.calculateAverageGPA());

        // Saving student records to file
        records.saveToFile("student_records.txt");
    }
}
