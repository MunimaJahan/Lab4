package comparator;
public class Employee implements Comparable<Employee>{
  
  private String name;
  private double salary;
  private int id;
  public Employee(String name, double salary, int id){
    this.name = name;
    this.salary = salary;
    this.id = id;
  }
  @Override
  public String toString(){
    return String.format("Employee[name=%s,salary=%s,id=%s]",name,salary,id);
  }
  public int getID(){
    return id;
  }
//Make this class sort using Java's interface
  
}