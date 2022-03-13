import java.util.Scanner;

public class Ans10 {
//    10. Write a Java program that takes a number as input and prints its  multiplication table up to 10.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of table");
        int n= scan.nextInt();
        for(int i=1; i<=10; i++){
           int num = i*n;
            System.out.println(n+"*"+i+" = "+num);
        }
    }
}
