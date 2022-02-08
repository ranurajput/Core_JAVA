package com.knoldus.kup.CoreJava.Question17;
import java.util.*;
public class TryCatchFinally {
    public void block(){
        System.out.println("Try, Multiple Catch and Finally Blocks");
        System.out.println("Try Block");
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            System.out.println(100/n);//ArithmeticException
            System.out.println("RanuRajput".charAt(15));//StringIndexOutOfBoundsException
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException");
        }
        catch (StringIndexOutOfBoundsException siobe){
            System.out.println("StringIndexOutOfBoundsException");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Try executed successfully");

        }
    }
    public static void main(String... args){
        TryCatchFinally tcf = new TryCatchFinally();
        tcf.block();
    }
}
//OUTPUT-->
//Try, Multiple Catch and Finally Blocks
//Try Block
//Enter a number
//2
//50
//StringIndexOutOfBoundsException
//Try executed successfully
