package Day14;
abstract class Shape{
    void display() {
        System.out.println("This is a shape");
    }
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
public class AbstractClasswithNormalMethod {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.draw();
    }
}
