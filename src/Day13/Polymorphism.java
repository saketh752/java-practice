package Day13;
class Employee {
    void work(){
        System.out.println("Working");
    }
}
class Developer extends Employee{
    void work(){
        System.out.println("Writing Code");
    }
}
class Tester extends Employee{
    void work(){
        System.out.println("Testing the software");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Employee e;
        e = new Developer();
        e.work();

        e = new Tester();
        e.work();
    }
}
