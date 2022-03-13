public class Ans4 {
  /*  4. Write a Java programme using the following steps.
            4.1 Declare two instance and two static variables.
            4.2 Declare one instance method.
            4.3 Declare one static method.
            4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
            4.5 Declare the Main method.
            4.6 Call both instance and static methods into the Main method and run the programme.*/

    int a = 2;  // Instance variable
    int b = 3; // Instance variable
    static int c = 4;  // Static variable
    static int d = 5; // Static variable
    public static void main(String [] args)
    {   Ans4 f = new Ans4 ();
        f.m1(); //calling instance method through object
        Ans4.m2(); //calling static method through class name
    }
    // Instance variable
    void m1() {
        System.out.println(a); //Calling instance variable directly
        System.out.println(b); //Calling instance variable directly
        System.out.println(Ans4.c); //Calling static variable through class name
        System.out.println(Ans4.d); //Calling static variable through class name
    }
    //Static variable
    static void m2() {
        Ans4 e =new Ans4();
        System.out.println(e.a); //Calling Instance variable through object
        System.out.println(e.b); //Calling Instance variable through object
        System.out.println(Ans4.c); //Calling static variable through class name
        System.out.println(Ans4.d);//Calling static variable through class name
    }
}
