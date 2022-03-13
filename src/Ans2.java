public class Ans2 {

   /* 2. Write a Java programme using the following steps.
            2.1 Declare two static variables
            2.2 Declare one static method
            2.3 Call both static variables into the static method inside the print statement. 2.4 Declare the Main method.
            2.5 Call the static method into the Main method and Run the programme.*/

    static int a = 10;   // Static variable
    static int b = 20;  // static variable

    public static void main(String[] args) {
        Ans2.m1(); // calling static method through class name
    }
    // Static method
    static void m1() {
        System.out.println(Ans2.a);  // Calling static variable through class name
        System.out.println(Ans2.b);
    }

}
