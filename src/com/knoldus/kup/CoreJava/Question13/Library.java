package com.knoldus.kup.CoreJava.Question13;
import com.knoldus.kup.CoreJava.Main;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Library implements LibraryManagementSystem{
    int bookId;
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Book> add(ArrayList books) {
        System.out.println("Enter the book name");
        String title = scanner.next();
        Main.print("Enter Book id");
        int bookId = scanner.nextInt();
        Book book = new Book(bookId, title);
        books.add(book);
        System.out.println("your details are Name: " + book.title + " Book ID: " + book.bookId);
        return books;
    }
    public ArrayList<IssueBook> issueBook(ArrayList books, ArrayList issueBooks) {
        System.out.println("Enter Book Id");
        bookId = scanner.nextInt();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        int j =0;
        for (int i =0; i<books.size();i++){
            Book book = (Book) books.get(i);

            if(book.bookId == bookId){
                j++;
                System.out.println("Enter Student Id");
                int studentId = scanner.nextInt();
                IssueBook issueBook=new IssueBook(bookId,studentId,strDate);
                issueBooks.add(issueBook);
            }
        }
        if(j==0){
            System.out.println("! No book found in list please add a book first");
        }
        return issueBooks;
    }
    ArrayList<IssueBook> returnBook(ArrayList issueList) {
        Main.print("Enter Student Id");
        int studentId = scanner.nextInt();
        int k =0;
        Main.print("Enter Book Id");
        int bookId = scanner.nextInt();
        for (int i=0; i<issueList.size(); i++){
            IssueBook issueBook = (IssueBook) issueList.get(i);
            if(issueBook.bookId == bookId){
                k++;
                issueList.remove(i);
                Main.print("Book returned successfully");
            }
        }
        if (k == 0) {
            Main.print("Book not found in Issued data");
        }
        return issueList;
    }

    void issuedBooksList(ArrayList issueBooks) {
        for(int i=0;i<issueBooks.size();i++){
            Main.print(issueBooks.get(i)+"\n");
        }
    }
    void availableBooks(ArrayList Book){
        for(int i=0;i<Book.size();i++){
            Main.print(Book.get(i)+"\n");
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void show() {

    }
}