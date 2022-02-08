package com.knoldus.kup.CoreJava.Question8;
import com.knoldus.kup.CoreJava.Main;
public class StaticBlock {
    private static String FirstName;
    private static String LastName;
    private static int Age;
    static
    {
        FirstName = "Ranu";
        LastName = "Rajput";
        Age = 22;
    }
    public static void printData()
    {
        Main.print("First Name : " +FirstName + "\nLast Name : " +LastName + "\nAge : " +Age);
    }
    public static void main(String... args)
    {
        StaticBlock.printData();
    }
}
