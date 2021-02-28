public class Employee {
  
  private String name;
  private double salary;
  public Employee(String name, Grade grade){
    this.name = name;
    this.grade = grade;
  }
  @Override
  public String toString(){
    return String.format("Employee[name=%s,grade=%s]",name,grade);
  }
  //Make this class sort using Java's interface
}