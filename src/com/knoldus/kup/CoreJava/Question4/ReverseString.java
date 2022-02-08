package com.knoldus.kup.CoreJava.Question4;
import com.knoldus.kup.CoreJava.Main;
public class ReverseString {
    public static String reverseString(String str)
    {
        String s = "";

        for(int i = str.length()-1;i>=0;i--)
        {
            s += str.charAt(i);
        }
        return s;
    }
    public static void main(String... args)
    {
        String str = "Java Developer Ranu Rajput is here";
        Main.print(ReverseString.reverseString(str));
    }
}
