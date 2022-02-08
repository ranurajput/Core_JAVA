package com.knoldus.kup.CoreJava.Question18.Part3;
import com.knoldus.kup.CoreJava.Main;
interface Vehicle {
    static void display(String name) {
        Main.print("Vehicle details:");
    }
    default void run(){
        Main.print("Vehicle is running");
    }
}
interface VehicleTest{
    public default void run(){
        Main.print("From Vehicle Test Interface");
    }
}

class Bike implements Vehicle, VehicleTest{
    String name;
    Bike(String name){
        this.name = name;
    }
    @Override
    public void run() {
        Main.print("Bike is running.... from Vehicle interface");
        Main.print("Bike is running.... from VehicleTest interface");
    }

    public static void display(String name){
        Main.print("Bike name : "+name);
    }
}