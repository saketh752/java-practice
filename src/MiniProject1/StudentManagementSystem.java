package MiniProject1;
import java.util.Scanner;
public class StudentManagementSystem {
    public static void main(String[] args) {
        System.out.println("===== Student Management System =====");
        Scanner sc = new Scanner(System.in);
        String names[] = new String[3];
        int marks[] = new int[3];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter Student name: ");
            names[i] = sc.next();

            System.out.println("Enter Student marks: ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + " ");
            System.out.println("Marks: " + marks[i] + " ");
        }
        System.out.println("Enter student name to search: ");
        String searchName = sc.next();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found");
            System.out.println(marks[index]);
        } else {
            System.out.println("Student Not Found");
        }
        int max = marks[0];
        int maxIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                maxIndex = i;
            }
        }
        System.out.println("Top Student = " + names[maxIndex]);
        System.out.println("Highest Marks = " + max);
        int sum = 0;
        double average = 0;
        for (int i = 0; i < names.length; i++) {
            sum += marks[i];
        }
        average = (double) sum / marks.length;
        System.out.println("Average Marks = " + average);
    }
}
