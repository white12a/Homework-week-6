public class Ans3 {
   /* 3. Write a Java programme using the following steps.
            3.1 Declare one instance and one static variable.
            3.2 Declare one instance method.
            3.3 Declare one static method.
            3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
            3.5 Declare the Main method.
            3.6 Call both instance and static methods into the Main method and run the programme.*/


    int a =5;  // Instance variable
    static int b =6;  //Static Variable
    public static void main(String [] args)
    {   Ans3 d =new Ans3();
        d.m1(); //calling instance method through object
        Ans3.m2(); //calling static method through class name
    }
    //Instance method
    void m1() {
        System.out.println(a);   //calling instance variable directly
        System.out.println(Ans3.b); // calling static variable through class name
    }
    //Static method
    static void m2() {
        Ans3 c =new Ans3();
        System.out.println(c.a); //Calling instance variable through object
        System.out.println(Ans3.b); // calling static variable through class name
    }
}
