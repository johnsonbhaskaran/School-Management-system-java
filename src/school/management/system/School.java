package school.management.system;

import java.util.List;

/**
 * Many Teachers and many Students
 * Implement teachers and Students using an ArrayList.
 * Created by JohnsonB on 30/01/2024.
 */
public class School {
  private List<Teacher> teachers;
  private List<Student> students;
  private static int totalMoneyEarned = 0;
  private static int totalMoneySpent = 0;

  /**
   * new school objects created
   * @param teachers List of Teachers in the school
   * @param students List of Students in the school
   */
  public School(List<Teacher> teachers, List<Student> students) {
    this.teachers = teachers;
    this.students = students;
    totalMoneyEarned = 0;
    totalMoneySpent = 0;
  }

  /**
   *
   * @return Returns the List of Teachers in the school
   */
  public List<Teacher> getTeachers() {
    return teachers;
  }

  /**
   *
   * @return Returns the List of Students in the school
   */
  public List<Student> getStudents() {
    return students;
  }

  /**
   *
   * @return Returns Total money earned by the school
   */
  public int getTotalMoneyEarned() {
    return totalMoneyEarned;
  }

  /**
   *
   * @return Returns Total money spent by the school
   */
  public int getTotalMoneySpent() {
    return totalMoneySpent;
  }

  /**
   *
   * @param teacher Add function to update the List of Teachers
   */
  public void addTeachers(Teacher teacher) {
    teachers.add(teacher);
  }

  /**
   *
   * @param student Add function to update the List of Students
   */
  public void addStudents(Student student) {
    students.add(student);
  }

  /**
   *
   * @param moneyEarned  Function to update Total money earned
   */
  public static void updateTotalMoneyEarned(int moneyEarned) {
    totalMoneyEarned += moneyEarned;
  }

  /**
   *
   * @param moneySpent  Setter to update Total money spent
   */
  public static void setTotalMoneySpent(int moneySpent) {
    totalMoneySpent -= moneySpent;
    totalMoneyEarned -= moneySpent;
  }


}
