public class Ans1 {
   /* 1. Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and Run the programme.*/


    int a = 10;  // Instance variable
    int b = 20;  // Instance variable

    public static void main(String[] args) {
        Ans1 a2 = new Ans1();
        a2.addition(); // calling instance method through object
    }
    // Instance Method
    void addition() {
        Ans1 a1 = new Ans1();  //Calling instance variable through object
        System.out.println(a1.a);
        System.out.println(a1.b);
    }
}

