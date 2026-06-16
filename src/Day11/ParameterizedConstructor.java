package Day11;
class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee("Saketh");
        System.out.println(e1.name);
    }
}
