package school.management.system;

/**
 * Created by JohnsonB on 30/01/2024.
 */
public class Student {
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  /**
   * To create a new Student object by initializing id, name and grade
   * Fees for every Student is $30,000.
   * Fees paid initially is 0.
   * @param id id for the Student: unique.
   * @param name name of the Student.
   * @param grade grade of the Student.
   */
  public Student(int id, String name, int grade) {
    this.feesPaid = 0;
    this.feesTotal = 30000;
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

//  NOT GOING TO ALTER THE STUDENTS NAME OR STUDENTS ID

  /**
   * Setter function to alter the grade after object initialization.
   * @param grade altered grade of the Student
   */
  public void setGrade(int grade) {
    this.grade = grade;
  }

  /**
   * Function to update the fees paid.
   * Keep adding the fees to feesPaid field.
   * Add the fees to the fees paid.
   * The school is going receive the funds.
   * @param feesPaid the fees the students pays.
   */
  public void updateFeesPaid(int feesPaid) {
    this.feesPaid += feesPaid;
    School.updateTotalMoneyEarned(feesPaid);
  }

  /**
   *
   * @return returns student ID
   */
  public int getId() {
    return id;
  }

  /**
   *
   * @return returns Student name
   */
  public String getName() {
    return name;
  }

  /**
   * returns Student grade
   * @return
   */
  public int getGrade() {
    return grade;
  }

  /**
   *
   * @return returns Student fees Paid so far status
   */
  public int getFeesPaid() {
    return feesPaid;
  }

  /**
   *
   * @return returns Student Total fees to be paid.
   */
  public int getFeesTotal() {
    return feesTotal;
  }

  public int getRemainingFees() {
    return feesTotal-feesPaid;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", grade=" + grade +
            ", feesPaid=" + feesPaid +
            ", feesTotal=" + feesTotal +
            '}';
  }
}
