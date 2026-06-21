package Day12;
class Computer{
    public void usage(){
        System.out.println("Fixed");
    }
}
class Laptop extends Computer{
    public void flexible(){
        System.out.println("Flexible");
    }
}
class GamingLaptop extends Laptop{
    public void task(){
        System.out.println("Supports Heavy Task");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        GamingLaptop gl = new GamingLaptop();
       gl.task();
       gl.flexible();
       gl.usage();
    }
}
