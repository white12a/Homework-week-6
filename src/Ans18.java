import java.util.Scanner;

public class Ans18 {
   /* 18. Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
    Test Data:
    Input first number: 125
    Input second number: 24
    Expected Output :
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5*/
   public static void main(String[] args) {

       System.out.println("Input first number");
       Scanner Input =new Scanner(System.in);
       int num1 =Input.nextInt();
       System.out.println("Input second number");
       int num2 =Input.nextInt();
       int sum = num1+num2;
       System.out.println(num1 +" + " +num2+ " = "+ sum);
       int sub = num1- num2;
       System.out.println(num1 +" - " +num2+ " = "+ sub);
       int multi = num1*num2;
       System.out.println(num1 +" * " +num2+ " = "+ multi);
       double division = num1/num2;
       System.out.println(num1 +" / " +num2+ " = "+ division);
       double per =num1%num2;
       System.out.println(num1 +" % " +num2+ " = "+ per);
   }


}
