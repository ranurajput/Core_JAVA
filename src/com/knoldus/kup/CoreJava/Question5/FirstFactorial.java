package com.knoldus.kup.CoreJava.Question5;
import com.knoldus.kup.CoreJava.Main;
public class FirstFactorial {
    public int factorial(int num)
    {
      int factorial = num;
      if(num<=0)
      {
          return 1;
      }
      for(int i =1;i<num;i++)
      {
          factorial = factorial * i;
      }
      return factorial;
    }
    public static void main(String... args)
    {
        FirstFactorial f = new FirstFactorial();
        Main.print(f.factorial(5));
    }
}
