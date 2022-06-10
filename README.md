# CoreJava

Q1.Write a Java program to return true if a given string contain the string 'pop', but the middle 'o' also may other character.
 
Q2.Write a Java program to sort a given binary array in linear times.
Linear time: An algorithm is said to take linear time, or O(n) time, if its time complexity is O(n). Informally, this means that the running time increases at most linearly with the size of the input. More precisely, this means that there is a constant c such that the running time is at most cn for every input of size n. For example, a procedure that adds up all elements of a list requires time proportional to the length of the list, if the adding time is constant, or, at least, bounded by a constant.
Example:
Input :
b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output:
After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Q3. Write a Java program to remove a specified character from a given string. 
Sample Output:
Original string:  abcdefabcdeabcdaaa
Second string:  bcdefbcdebcd

Q4.Write a Java Program to reverse a string without using String inbuilt function.Q5.First Factorial
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer.Examples
Input: 4
Output: 24
Input: 8
Output: 40320


Q6. Write a program to find the number of occurrences of the duplicate words in a string and print them?
Q7. Write a program to find the number of occurrences of a character in a string without using a loop?
string
Q8.Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively

Q9.Create 3 subclasses of bank SBI, BOI, ICICI all 4 should have a method called get details which provide there specific details like rate of interest etc, print details of every bank.

Q10. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal to its last character. For the required loop, use awhile statementdo-while statement

Q11. Design classes having attributes and methods (only skeleton) for a coffee shop. There are three different actors in our scenario and I have listed the different actions they do also below

* Customer
  - Pays the cash to the cashier and places his order, get a token number back
  - Waits for the intimation that order for his token is ready
  - Upon intimation/notification he collects the coffee and enjoys his drink
  ( Assumption:  Customer waits till the coffee is done, he won’t timeout and cancel the order. The customer always likes the drink served. Exceptions like he not liking his coffee, he got wrong coffee are not considered to keep the design simple.)

* Cashier
  - Takes order and payment from the customer
  - Upon payment, creates an order and places it into the order queue
  - Intimates the customer that he has to wait for his token and gives him his token
  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)

* Barista
 - Gets the next order from the queue
 - Prepares the coffee
 - Places the coffee in the completed order queue
 - Places a notification that order for token is ready

Q12. Create a custom exception that do not have any stack trace
Q13. Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
Q14.WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
Q15. WAP to create a singleton class.
Q16. WAP to show object cloning in java using cloneable and copy constructor both.
Q17. WAP showing try, multi-catch and finally blocks.
Q18.Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.

Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference  
Implement following functional interfaces from java.util.function using lambdas:

(1) Consumer

(2) Supplier

(3) Predicate

(4) Function

-Create and access default and static method of an interface.
-Override the default method of the interface.
-Implement multiple inheritance with default method inside  interface.

Q19.Convert a non-negative integer num to its English words representation.
    Input: num = 123
    Output: "One Hundred Twenty Three"
    Input: num = 1234567891
    Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty            
    Seven Thousand Eight Hundred Ninety One"


Q20.This assignment is supposed to make you practice your skills on interfaces, classes and OOPs.
Story - The system is a duck simulation game. There are ducks, each having weight and number of wings. All ducks can fly and quack, but different type of ducks fly and quack differently. For instance, let us consider the following–
1.Rubber ducks don’t fly and squeak.
2.Mallard ducks fly fast and quack loud.
3.Redhead ducks fly slow and quack mild.
All ducks have following common property:
Type of Duck – Use enum to represent this value
Design classes and interfaces for the above story to meet the following requirements -
a.Create a duck
b.Show details of a duck, i.e. when you call for e.g. ShowDetails() method of a duck, duck should print its traits.
User following concepts: class, interfaces, polymorphism etc.

Q21.Write a java program to maintain the list of Employees who works in the organization. Follow the below given design to develop the above program:
Design a class Employee with EmpId, EmpName & EmpDesignation as private
attributes. It contains a parameterized constructor to initialize all the data members of class. It also comprises the Getter methods for all the private fields.
Design a main class comprising main method. The main class comprises an array of Employee object which needs to be initialized with the command line input.
It displays the information of Employees from the array using loop.

Q22.Check Digits. Credit cards usually have a so-called check digit. This is a single digit that I assigned when the account number is developed and has a special property. One particularly simple mechanism is to assign the last digit of the sum of all the other digits. For example, suppose we have a nine-digit account number (including the check digit). The check digit would be the sum of the eight digits. This digit could be placed any where’s in the sequence, say the
third digit. As a full example, suppose the eight numbers are 12345678. Their sum is 36; thus, 6 is the check digit. The account number is therefore 126345678. Write a program to read in a nine digit integer from the keyboard and check it for these rules. Write"okay" or "not okay" for the results of the test.
