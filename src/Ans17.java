import java.util.Scanner;

public class Ans17 {
   /* 17. Write a Java program to convert a decimal number to binary number.  Input Data:
    Input a Decimal Number : 5
    Expected Output
    Binary number is: 101*/

    public static void main(String[] args) {
        System.out.println("Enter the decimal number");
        Scanner scan= new Scanner(System.in);
        int decimal = scan.nextInt();
        System.out.println(Integer.toBinaryString(decimal));
    }

}
