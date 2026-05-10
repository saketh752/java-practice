public class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.print("Implicit conversion: ");
        System.out.println(b);

        double num= 25.2;
        int result = (int)num;
        System.out.print("Explict Conversion: ");
        System.out.println(result);

    }
}
