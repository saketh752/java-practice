package Day10;
class Employee{
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Rahul");
        System.out.println("Name: " + e1.getName());
        e1.setSalary(30000);
        System.out.println("Salary: " + e1.getSalary());
    }
}
