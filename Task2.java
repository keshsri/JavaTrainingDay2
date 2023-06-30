import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the length");
        int len = sc.nextInt();
        System.out.println("Enter the breadth");
        int bred = sc.nextInt();

        if (len == bred){
            System.out.println("The shape is a square");
        }
        else {
            System.out.println("The shape is not a square");
        }
    }
}
