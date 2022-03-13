import java.util.Scanner;

public class Ans13 {

   // 13. Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.
   public static void main(String args[]) {
       Scanner Input = new Scanner(System.in);

       System.out.println("Enter the first number:");
       int first = Input.nextInt();

       System.out.println("Enter the second number:");
       int second = Input.nextInt();

       System.out.println("Enter the third number:");
       int third = Input.nextInt();

       //average= (first+second+third)/3
       double average = (first+second+third)/3;
       System.out.println("Average of number is: " + average);

   }
}
