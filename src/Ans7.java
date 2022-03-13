import java.util.Scanner;

public class Ans7 {
    /*7. Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

    public static void main(String[] Strings) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
