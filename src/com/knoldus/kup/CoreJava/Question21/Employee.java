package com.knoldus.kup.CoreJava.Question21;
import com.knoldus.kup.CoreJava.Main;
import java.util.Scanner;

//Creating an employee
public class Employee {
    private int empId;
    private String empName, empDesignation;
    Employee(int empId, String empName, String empDestination){
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDestination;
    }
    void setEmpId(int empId){
        this.empId =empId;
    }
    void setEmpName(String name){
        this.empName =empName;
    }
    void setEmpDesignation (String empDesignation){
        this.empDesignation =empDesignation;
    }
    int getEmpId(){
        return this.empId;
    }
    String getEmpName(){
        return this.empName;
    }
    String getEmpDesignation(){
        return this.empDesignation;
    }
}


class List{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Main.print("Enter number of employees");
        int num = sc.nextInt();
//        creating array of employees
        Employee[] employee=new Employee[num];
        for (int i=0; i<num; i++){
            Main.print("Enter Employee id");
            int id = sc.nextInt();
            Main.print("Enter Employee Name");
            String name = sc.next();
            Main.print("Enter Employee Designation");
            String designation = sc.next();
            employee[i] = new Employee(id,name,designation);
        }
//        printing all the employees
        for (Employee emp:employee) {
            Main.print("Employee ID: "+emp.getEmpId()+"\nEmployee Name: "+emp.getEmpName()+"\nDesignation: "+emp.getEmpDesignation());
        }

    }
}