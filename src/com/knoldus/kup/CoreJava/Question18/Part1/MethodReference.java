package com.knoldus.kup.CoreJava.Question18.Part1;
import com.knoldus.kup.CoreJava.Main;
interface Addition{
    int add(int num1, int num2);
}
interface Subtration{
    int subtract(int num1, int num2);
}

@FunctionalInterface
interface Multiplication{
    abstract int multiply(int num1, int num2);
}

class InstanceReference{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtraction(int num1, int num2){
        return num1 + num2;
    }
}
class StaticReference{
    static int multiplication(int num1, int num2){
        return num1 * num2;
    }
}

class MethodReference {
    public static void main(String[] args) {
        InstanceReference instanceReference = new InstanceReference();
        Addition add = instanceReference::add;
        Main.print("Additon : "+add.add(4,5));

        Subtration sub = instanceReference::subtraction;
        Main.print("Subtraction : "+sub.subtract(41,2));

        Multiplication mul = StaticReference::multiplication;
        Main.print("Multiplication : "+mul.multiply(5,4));
    }
}

