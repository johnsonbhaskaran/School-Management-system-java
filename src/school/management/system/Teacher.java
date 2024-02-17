package school.management.system;

/**
 * This class is responsible for the Teacher object creation
 * Created by JohnsonB on 30/01/2024.
 */
public class Teacher {
  private int id;
  private String name;
  private int salary;
  private int salaryEarned;

  /**
   * Constructor to create object by teacher id, name, salary initialization.
   * @param id id for the teacher
   * @param name name of the teacher
   * @param salary salary for the teacher
   */
  public Teacher(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.salaryEarned = 0;
  }

  /**
   * Getter for the teacher name
   * @return returns teacher's name
   */
  public String getName() {
    return name;
  }

  /**
   * Getter for the teacher ID
   * @return returns teacher ID
   */
  public int getId() {
    return id;
  }

  /**
   * Getter for the teacher salary
   * @return returns teacher salary
   */
  public int getSalary() {
    return salary;
  }

  /**
   * Setter Function to update the salary
   * @param salary new updated salary for the teacher
   */
  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void receiveSalary(int salary) {
    salaryEarned += salary;
    School.setTotalMoneySpent(salary);
  }

  public int getSalaryEarned() {
    return salaryEarned;
  }

  @Override
  public String toString() {
    return "Teacher{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            ", salaryEarned=" + salaryEarned +
            '}';
  }
}
