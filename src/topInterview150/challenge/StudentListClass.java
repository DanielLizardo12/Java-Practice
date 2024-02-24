package topInterview150.challenge;

/**
 * StudentListClass description.
 *
 * @author Daniel
 * @version 23/02/2024
 */

public class StudentListClass {

  static class Student {
    private String name;
    private static int studentId = 0;

    public Student(String name) {
      this.name = name;
      this.studentId++;
    }

    @Override
    public String toString() {
      return studentId + ": " + name;
    }
  }

  public static void main(String[] args) {
    Student student = new Student("dan");
    System.out.println(student.toString());
    Student student1 = new Student("john");
    System.out.println(student1.toString());
    Student student2 = new Student("drake");
    System.out.println(student2.toString());
  }


}
