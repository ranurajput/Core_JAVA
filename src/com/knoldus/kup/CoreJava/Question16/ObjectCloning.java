package com.knoldus.kup.CoreJava.Question16;
import com.knoldus.kup.CoreJava.Main;
public class ObjectCloning implements Cloneable{
    int id;
    String name;
    String company;
    ObjectCloning(int id, String name, String company)
    {
        this.id= id;
        this.name = name;
        this.company = company;
    }
    //    Creating copy constructor
    ObjectCloning(ObjectCloning objectCloning){
        this.id = objectCloning.id;
        this.name = objectCloning.name;
        this.company = objectCloning.company;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        ObjectCloning obj1 =new ObjectCloning(1743, "Ranu Rajput", "Knoldus Inc");
//        By using clone method
        Main.print("Object cloning by using clone method");
        ObjectCloning obj2 = (ObjectCloning) obj1.clone();
        Main.print("Id: "+obj1.id+"\nName: "+obj1.name+"\nCompany: "+obj1.company);
        Main.print("Id: "+obj2.id+"\nName: "+obj2.name+"\nCompany: "+obj2.company);
        Main.print("=====================================================================");
//        By using copy constructor
        Main.print("Object cloning By Using Copy Constructor");
        ObjectCloning copyObj = new ObjectCloning(obj1);
        Main.print("Id: "+copyObj.id+"\nName: "+copyObj.name+"\nCompany: "+copyObj.company);
    }
}