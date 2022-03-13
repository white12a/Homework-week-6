import java.util.Scanner;

public class Ans15 {
    //15. Write a Java program to swap two variables.
    public static void main(String args[]) {
        int x, y, z;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter value of x");
        x = Input.nextInt();
        System.out.println("Enter value of y");
        y = Input.nextInt();
        System.out.println("Before swapping value x is " + x + " and value of y is " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("After swapping value x is " + y + " and value of y is " + x);

    }

}
