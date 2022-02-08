package com.knoldus.kup.CoreJava.Question18.Part3;

public class MainApplication {
    public static void main(String[] args) {
        Bike bike = new Bike("HONDA");
        bike.run();
        Bike.display(bike.name);
    }
}
