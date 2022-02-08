package com.knoldus.kup.CoreJava.Question1;
import com.knoldus.kup.CoreJava.Main;

public class CheckPop {
    //declared check() method as static to call this direct from class name
    public static boolean check(String str)
    {
        for (int i =0; i<str.length()-2; i++)
        {
            if (str.charAt(i)=='p' && str.charAt(i+2) == 'p')
            {
                return true;
            }
        }
        return  false;
    }
    public static void main(String... args) {
        //defined a class as Main and a static method print() inside the class to print
        System.out.println(" Ranu Rajput");
        Main.print(CheckPop.check("hipophi"));//true
        Main.print(CheckPop.check("lolipop"));//true
        Main.print(CheckPop.check("toptop"));//false
        Main.print(CheckPop.check("topmytop"));//false
        Main.print(CheckPop.check("roomtoppoptop"));//true
        Main.print(CheckPop.check("ranurajput"));//false
        Main.print(CheckPop.check("lazmirajput"));//false
    }
}