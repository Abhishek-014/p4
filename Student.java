
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester, List<Course> courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public void displayFailedCourses() {
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println(name + " has scored " + course.getMarks() +
                                   " in " + course.getCourseName());
            }
        }
    }
        public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 85);
        Course c2 = new Course("Physics", 32);
        Course c3 = new Course("Chemistry", 70);
        Course c4 = new Course("Biology", 25);

        List<Course> courseList = Arrays.asList(c1, c2, c3, c4);

        Student student = new Student("John Doe", "BSc", 2, courseList);

        // 1. Retrieve student details
        student.displayStudentInfo();

        // 2. Retrieve failed subjects
        System.out.println("\nCourses with marks < 40:");
        student.displayFailedCourses();
    }
}
    

}
