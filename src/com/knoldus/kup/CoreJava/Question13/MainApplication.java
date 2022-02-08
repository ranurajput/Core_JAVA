package com.knoldus.kup.CoreJava.Question13;
import com.knoldus.kup.CoreJava.Main;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String... args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<IssueBook> issueBooks = new ArrayList<>();
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        char r;
        do {
            Main.print("============= Library Management System =============\n" +
                    "Press 1: To add a book\n" +
                    "Press 2: To issue a book\n" +
                    "Press 3: To return a book\n" +
                    "Press 4: To see issued books detail\n" +
                    "Press 5: To see all the available books\n" +
                    "Press 6: To Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    library.add(books);
                    Main.print("Book added successfully");
                    break;
                case 2:
                    library.issueBook(books,issueBooks);
                    Main.print("Book issued successfully");
                    break;
                case 3:
                    library.returnBook(issueBooks);
                    break;
                case 4:
                    library.issuedBooksList(issueBooks);
                    break;
                case 5:
                    library.availableBooks(books);
                    break;
                case 6:
                    Main.print("Thanks for using our service");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println("Do you want to continue with application Y/N");
            r = sc.next().charAt(0);

        }while (r == 'Y' || r == 'y') ;
        if (r == 'N' || r == 'n') {
            System.exit(0);
        }
    }
}
