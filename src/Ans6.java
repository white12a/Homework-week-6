import java.util.Scanner;

public class Ans6 {

    //6. Write a program to enter any radius value of the circle and find out the  area.(Formula of Area A=PI*r*r).

    public static void main(String args[])
    {
        Ans6 a =new Ans6();
        a.temp();
    }
    // Instance method
    void temp(){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the value of R");
        double radius = Input.nextDouble();

        //area of circle= (22*r*r)/7
        double areaCircle = (22 * radius * radius) / 7;
        System.out.println("Area of circle is: " + areaCircle);
    }
}
