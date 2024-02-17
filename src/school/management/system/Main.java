package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Teacher teacherLissy = new Teacher(1, "Lissy", 500);
    Teacher teacherThomas = new Teacher(2, "Thomas", 450);
    Teacher teacherParker = new Teacher(3, "Parker", 600);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(teacherLissy);
    teacherList.add(teacherThomas);
    teacherList.add(teacherParker);

    Student studentJacob = new Student(1, "Jacob", 10);
    Student studentJohnson = new Student(1, "Johnson", 12);
    Student studentJason = new Student(1, "Jason", 3);

    List<Student> studentList = new ArrayList<>();
    studentList.add(studentJacob);
    studentList.add(studentJohnson);
    studentList.add(studentJason);

    School governmentHighSchool = new School(teacherList, studentList);

    System.out.println("GHS has earned so far $" + governmentHighSchool.getTotalMoneyEarned());

    studentJason.updateFeesPaid(4500);
    System.out.println();
    System.out.println(studentJason.getName() + " Remaining fees to be paid $" + studentJason.getRemainingFees());
    System.out.println("GHS has earned so far $" + governmentHighSchool.getTotalMoneyEarned());

    studentJohnson.updateFeesPaid(25000);
    System.out.println();
    System.out.println(studentJohnson.getName() + " Remaining fees to be paid $" + studentJohnson.getRemainingFees());
    System.out.println("GHS has earned so far $" + governmentHighSchool.getTotalMoneyEarned());

    System.out.println();
    System.out.println("----------======== GHS Salary Day ========----------");
    System.out.println();
    teacherLissy.receiveSalary(teacherLissy.getSalary());
    System.out.println(teacherLissy.getName() + " received salary $" + teacherLissy.getSalaryEarned());
    teacherThomas.receiveSalary(teacherThomas.getSalary());
    System.out.println(teacherThomas.getName() + " received salary $" + teacherThomas.getSalaryEarned());
    teacherParker.receiveSalary(teacherParker.getSalary());
    System.out.println(teacherParker.getName() + " received salary $" + teacherParker.getSalaryEarned());
    System.out.println();
    System.out.println("GHS has earned so far $" + governmentHighSchool.getTotalMoneyEarned());

    System.out.println();
    System.out.println(studentJohnson);
    System.out.println(teacherParker);
  }
}
