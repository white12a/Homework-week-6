import java.util.Scanner;

public class Ans16 {
   /* 16. Write a Java program to add two binary numbers.
    Input Data:
    Input first binary number: 10
    Input second binary number: 11
    Expected Output:
    Sum of two binary numbers: 101*/

    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String x = Input.next();
        System.out.println("Enter second binary number");
        String y =Input.next();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int sum =a+b;
        System.out.println("Sum of two binary numbers: "+ Integer.toBinaryString(sum));

    }
}
