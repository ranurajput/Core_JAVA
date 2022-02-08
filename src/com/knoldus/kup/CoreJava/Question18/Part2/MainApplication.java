package com.knoldus.kup.CoreJava.Question18.Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApplication{
    public static void main(String[] args) {
        EmployeeFactory empFactory = Employee::new;
        Employee emp1 = empFactory.getEmployee("Ranu Rajput", 22, "Nagina");
        Employee emp2 = empFactory.getEmployee("Lazmi Rajput", 20, "Bijnor");

        List<String> employees =new ArrayList<>();
        employees.add(emp1.toString());
        employees.add(emp2.toString());

// Using Consumer interface
        // Referring method to String type Consumer interface
        Consumer<String> printTxt = ConsumerInterface::printMessage;
        printTxt.accept("Hello from consumer");   // Calling Consumer method

        Consumer<List<String>> employeePrint = (t) -> System.out.println(t);
        Stream<List<String>> empdetail = Stream.of((employees));
        empdetail.forEach(employeePrint);


//      By using default andThen method of Consumer interface
        Consumer<Integer> display = a -> System.out.println(a);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of integers
        Consumer<List<Integer> >
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        // using addThen()
        modify.andThen(dispList).accept(list);


// Supplier Interface
        // This function returns a random value.
        Supplier<Boolean> empty = () -> employees.isEmpty();
        // Print the random value using get()
        printTxt.accept("\nUsing get() method of Supplier Interface : Is employee list empty : "+empty.get());

// Using Function Interface
        Function<String , Integer> charOfList = a -> a.length();
        // apply the function to get the result
        List<Integer> list1 = employees.stream().map(charOfList).collect(Collectors.toList());
        printTxt.accept("Total characters in list:"+charOfList.apply(employees.toString()));

//  Using Predicate Interface

        Predicate<String> startPredicate = str -> str.startsWith("A");
        Predicate<String> lengthPredicate = str -> str.length() >= 10;
        employees.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);

        // Calling Predicate test() method
        // Creating predicate
        Predicate<Integer> lesserthan = age -> (age < 18);

        printTxt.accept("Using Predicate test() method : "+lesserthan.test(18)+"");

//  Calling Predicate and() method
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;
        List<Integer> listArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = listArr.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());

        printTxt.accept("Using Predicate default and() method: "+collect);

    }
}
