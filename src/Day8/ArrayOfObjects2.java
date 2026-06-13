package Day8;
class student {
    String name;
    int marks;
}
public class ArrayOfObjects2 {
    public static void main(String[] args) {
        student[] S = new student[3];

        S[0] = new student();
        S[1] = new student();
        S[2] = new student();

        S[0].name = "Saketh";
        S[0].marks = 95;

        S[1].name = "Rahul";
        S[1].marks = 90;

        S[2].name = "Anu";
        S[2].marks = 85;

        for(int i = 0; i < S.length; i++){
            System.out.println("Name: " + S[i].name +" "+"Marks: " + S[i].marks);
        }
    }
}
