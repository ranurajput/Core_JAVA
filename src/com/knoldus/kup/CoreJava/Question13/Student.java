package com.knoldus.kup.CoreJava.Question13;
public class Student implements User{
    String name,studentclass;
    int studentId;
    Student(int studentId, String name, String studentclass){
        this.studentId = studentId;
        this.name = name;
        this.studentclass = studentclass;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}