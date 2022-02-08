package com.knoldus.kup.CoreJava.Question13;

public class IssueBook {
    int studentId, bookId;
    String date;
    IssueBook(int bookId, int studentId, String date){
        this.bookId = bookId;
        this.studentId = studentId;
        this.date = date;
    }

    @Override
    public String toString() {
        return "IssueBook{ " +
                "studentId=" + studentId +
                ", bookId=" + bookId +
                ", date='" + date + '\'' +
                '}';
    }
}
