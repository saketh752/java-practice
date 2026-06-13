package Day8;
class Employee{
    String name;
    int salary;

}
public class EmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.name = "Saketh";
        e1.salary = 25000;

        e2.name = "Rahul";
        e2.salary = 30000;

        e3.name = "Anu";
        e3.salary = 28000;

        System.out.println(e1.name + " " + e1.salary);
        System.out.println(e2.name + " " + e2.salary);
        System.out.println(e3.name + " " + e3.salary);
    }


}
