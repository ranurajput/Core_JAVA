package com.knoldus.kup.CoreJava.Question10;
import com.knoldus.kup.CoreJava.Main;
import java.util.*;
public class ReadWords {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            s = sc.next();
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                Main.print("First and Last character is same of " + s);
            }
        }
        while (!s.equals("done"));
    }
}
        /*
ranu
lazmi
dhairya
aanaya
First and Last character is same of aanaya
thank you
done

Process finished with exit code 0 */


