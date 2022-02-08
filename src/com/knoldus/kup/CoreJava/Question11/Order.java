package com.knoldus.kup.CoreJava.Question11;

public class Order {
    int orderID;
    String coffeeType;
    int cost;
    Order(int orderID, String coffeeType,int cost){
        this.orderID = orderID;
        this.coffeeType =coffeeType;
        this.cost =cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", coffeeType='" + coffeeType + '\'' +
                '}';
    }
}
