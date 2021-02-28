import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
    ArrayList<Employee> Employees = new ArrayList<>();
    Employees.add(new Employee("Carl", Employee.Grade.CPLUS, 1));
    Employees.add(new Employee("Alice", Employee.Grade.A, 3));
    Employees.add(new Employee("Bob", Employee.Grade.B, 7));
    Employees.add(new Employee("Bill", Employee.Grade.BMINUS, 2));
    Employees.add(new Employee("Bamford", Employee.Grade.BMINUS, 0));
    Employees.add(new Employee("Carol", Employee.Grade.C, 6));
    System.out.println("unsorted "+ Employees);
    Collections.sort(Employees);
    System.out.println("natural ordering"+ Employees);
    Collections.sort(Employees);
    EmployeeIDComparator comp = new EmployeeIDComparator();
    Collections.sort(Employees, comp);
    System.out.println("id ordered "+ Employees);
  }
}