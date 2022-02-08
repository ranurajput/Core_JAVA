package com.knoldus.kup.CoreJava.Question15;
import com.knoldus.kup.CoreJava.Main;
public class SingletonClass {
    private static SingletonClass instance = null;
    private String text;

    private SingletonClass(){
        text = "This is singleton class constructor";
    }
    private static SingletonClass getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        Main.print(instance1.text);
        Main.print(instance1 == instance2); // Output : true // Because both the instances refer to
        // same memory location on the heap.
    }
}
