package Models;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emi
 */
//REFERENCEhttps://ksuap.github.io/2016spring/library/day3.html
public class BorrowingList {
   //attributs
    private String studentId;
    private String bookid;
    private boolean borrowed; // should be indivisual class? or Book class?
    private int borrowed_date;//no need?
    private int returned_date;//no need?    
    
   //constructors   object
//    public BorrowingList() {
//        this.studentId = studentId;
//        this.bookid = bookid;
//        this.borrowed = false;  // we can just check thee is someoone in Waitinglist?
//        this.borrowed_date = borrowed_date;
//        this.returned_date = returned_date;
//    }

    public BorrowingList() {
        this.studentId = studentId;
        this.bookid = bookid;
        this.borrowed = false;
//        this.borrowed_date = borrowed_date;
//        this.returned_date = returned_date;
    }

//    public BorrowingList(String studentId) {
//        this.studentId = studentId;
//        this.bookid = bookid;
//        this.borrowed = borrowed;
//        this.borrowed_date = borrowed_date;
//        this.returned_date = returned_date;
//    }

   //Method
    
    //creat a new borrowed book //REFERENCE https://www.thestudentroom.co.uk/showthread.php?t=2441484

    public String getStudentId() {
        return studentId;
    }

    public String getBookid() {
        return bookid;
    }
    //check it is borrowed or not
    public boolean isBorrowed() {
        return borrowed;
    }
    
    //if the book borrowed, register into the Borrowinglist
    public void borrowBook( ArrayList<Book> books,ArrayList<Student> students,int studentIndex,int bookIndex ){
        
            String studentId = students.get(studentIndex-1).getStudentId();
            String bookid = books.get(bookIndex-1).getId();
            
            
            
             
//            System.out.println(bwl.getStudentId() + " has borrowed " + bwl.getBookid());
//        } else {
//            waitingQueue.addStudent(student);
//            System.out.println(student.getName() + " is added to the waiting queue for " + getTitle());
//        }
    }
            

    public int getBorrowed_date() {
        return borrowed_date;
    }

    public int getReturned_date() {
        return returned_date;
    }

    @Override
    public String toString() {
        return "BorrowingList{" + "studentId=" + studentId + ", bookid=" + bookid + ", borrowed=" + borrowed + ", borrowed_date=" + borrowed_date + ", returned_date=" + returned_date + '}';
    }

}
