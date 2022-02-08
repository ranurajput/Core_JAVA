package com.knoldus.kup.CoreJava.Question14;
import com.knoldus.kup.CoreJava.Main;
public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {
        try {
//            To produce ClassNotFoundException
            Class.forName("com.knoldus.kup.CoreJava.ques14");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        Main.print("After exception occur rest of the code");
    }
}
