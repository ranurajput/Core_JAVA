package com.knoldus.kup.CoreJava.Question12;

public class CustomException {
    public static void main(String[] args)  {
        EmailValidator customException=new EmailValidator();
        try {
//            check email by using validate() method
            customException.validate("ranu.rajput#knoldus.com");
        }catch (EmailNotValidException e)
        {
            System.err.print(e);
        }
    }
}
