import java.util.Scanner;

public class Ans8 {
    //8. Write a program to calculate the area of a triangle.
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double base = Input.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = Input.nextDouble();

        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Area of Triangle is: " + area);

    }
}
