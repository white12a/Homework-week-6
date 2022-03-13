import java.util.Scanner;

public class Ans14 {
  /*  14. Write a Java program to print the area and perimeter of a rectangle. Test Data:
    Width = 5.5 Height = 8.5
    Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20 */
  public static void main(String args[]) {
      Scanner Input = new Scanner(System.in);

      System.out.println("Enter the width of the Triangle:");
      double width = Input.nextDouble();

      System.out.println("Enter the height of the Triangle:");
      double height = Input.nextDouble();

      //Area = width*height
      double area = width * height;
      System.out.println("Area is "+width+" * "+height+" =: " + area);
      //perimter = 2 * (width + height)
      double perimeter =  2 * (width + height);
      System.out.println("Perimeter is  2 * ( "+width+ "+ "+height+" ) =: "+perimeter);


  }

}
