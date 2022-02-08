package com.knoldus.kup.CoreJava.Question18.Part2;

@FunctionalInterface
public interface EmployeeFactory {
    public abstract Employee getEmployee(String name, Integer age, String city);
}
