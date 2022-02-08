package com.knoldus.kup.CoreJava.Question11;
import com.knoldus.kup.CoreJava.Main;
public class Customer {
    String name,contact;
    Customer(String name, String contact){
        this.name = name;
        this.contact =contact;
    }
    public void waitForCoffee(){
        Main.print("Wating ........");
    }
    public static void collectCoffee(String msg){
        Main.print("\n"+msg);
    }
    public void giveOrder(){
        int tokenNo = Cashier.takeOrder();
    }
}
