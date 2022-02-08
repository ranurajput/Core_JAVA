package com.knoldus.kup.CoreJava.Question11;

public class Barista extends Thread{
    int empId;
    String name;

    public static Order prepareCoffee(Order order){
        System.out.print("Coffee is being prepared please wait");
        for(int i=0;i<10;i++){
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Cashier.serveCoffee(order);
        return order;
    }
    void addOrderToCompleteQueue(){

    }

}
