package Day8;
class Students{
    String names;
        }
public class ArrayofObjects {
    public static void main(String[] args) {
        Students[] students = new Students[3];
        students [0] = new Students();
        students [1] = new Students();
        students [2] = new Students();

        students[0].names = "Saketh";
        students[1].names  = "Rahul";
        students[2].names = "Anu";

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].names);
        }
    }
}
