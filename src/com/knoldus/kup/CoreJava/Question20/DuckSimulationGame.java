package com.knoldus.kup.CoreJava.Question20;
import com.knoldus.kup.CoreJava.Main;
interface QuackBehavior{
    void quack();
}
interface FlyBehavior{
    void fly();
}

// We are defining each behaviour separately
class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        Main.print("I can't fly");
    }
}
class FlyFast implements FlyBehavior{
    @Override
    public void fly() {
        Main.print("flying fastly");
    }
}
class FlySlow implements FlyBehavior{
    @Override
    public void fly() {
        Main.print("flying slowly");
    }
}
class QuackLoud implements QuackBehavior{
    @Override
    public void quack() {
        Main.print("quack loudly");
    }
}
class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        Main.print("squeaking....");
    }
}
class QuackMild implements QuackBehavior{
    @Override
    public void quack() {
        Main.print("quacking mild.....");
    }
}

// It will represent the type of Duck
enum DuckType{
    RUBBER, MALLARD, REDHEAD
}

//This is the super class of all types of duck classes
abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Duck(){}
    void performFly() {
        this.flyBehavior.fly();
    }
    void performQuack() {
        this.quackBehavior.quack();
    }
    void showDetails(){
        Main.print("I am duck");
    }
}
class RubberDuck extends Duck{
    RubberDuck(){
        this.flyBehavior =new CantFly();
        this.quackBehavior =new Squeak();
    }

    @Override
    void showDetails() {
        Main.print("I am "+DuckType.RUBBER+" Duck");
    }
}
class MallardDuck extends Duck{
    MallardDuck()
    {
        this.flyBehavior = new FlyFast();
        this.quackBehavior = new QuackLoud();
    }
    @Override
    void showDetails() {
        Main.print("I am "+DuckType.MALLARD+" Duck");
    }
}
class ReadheadDuck extends Duck{
    ReadheadDuck()
    {
        this.flyBehavior = new FlySlow();
        this.quackBehavior =new QuackMild();
    }

    @Override
    void showDetails() {
        Main.print("I am "+DuckType.REDHEAD+" Duck");
    }
}
public class DuckSimulationGame {
    public static void main(String[] args) {
        Duck md=new MallardDuck();
        md.showDetails();
        md.performFly();
        md.performQuack();

        Main.print("==============================================");
        Duck rd=new RubberDuck();
        rd.showDetails();
        rd.performFly();
        rd.performQuack();

        Main.print("==================================================");
        Duck readheadDuck=new ReadheadDuck();
        readheadDuck.showDetails();
        readheadDuck.performFly();
        readheadDuck.performQuack();
    }
}
