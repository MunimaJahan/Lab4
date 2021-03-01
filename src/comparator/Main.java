import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
    ArrayList<Employee> Employees = new ArrayList<>();
    Employees.add(new Employee("Carl", 100, 1));
    Employees.add(new Employee("Alice", 500, 3));
    Employees.add(new Employee("Bob", 200, 7));
    Employees.add(new Employee("Bill", 200, 2));
    Employees.add(new Employee("Bamford", 700, 5));
    Employees.add(new Employee("Carol", 100, 6));
    System.out.println("unsorted "+ Employees);
    Collections.sort(Employees);
    System.out.println("natural ordering"+ Employees);
    Collections.sort(Employees);
    EmployeeIDComparator comp = new EmployeeIDComparator();
    Collections.sort(Employees, comp);
    System.out.println("id ordered "+ Employees);
  }
}
