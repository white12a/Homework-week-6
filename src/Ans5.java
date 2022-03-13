import java.util.Scanner;

public class Ans5 {
    /*5. Write a program for a calculator with addition, subtraction, multiplicationand division methods all
     with parameters and use string concatenation  methods.(Note:Two static and Two instance methods.)*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner class
        System.out.println("Enter the value of X");
        int x = scan.nextInt();
        System.out.println("Enter the value of Y");
        int y = scan.nextInt();

        Ans5 a = new Ans5();
        a.add(x, y); //Calling instance method through object
        a.subtraction(x, y); //Calling instance method through object
        Ans5.multiplication(x, y); //Calling static method through class name
        Ans5.division(x, y); //Calling static method through class name
    }
    // Instance method with no return type and with parameter
    void add(int x, int y) {
        int sum = x + y;
        System.out.println("sum of x+y is =" + sum);
    }
    // Instance method with no return type and with parameter
    void subtraction(int x, int y) {
        int sub = x - y;
        System.out.println("Subtraction of x-y is =" + sub);
    }

    //Static method with no return type and with parameter
    static void multiplication(int x, int y) {
        System.out.println("multiplication of x*y is =" + x * y);
    }

    //Static method with no return type and with parameter
    static void division(int x, int y) {
      double  div= x/y;
        System.out.println("division is x/y =" + div);
    }

}
