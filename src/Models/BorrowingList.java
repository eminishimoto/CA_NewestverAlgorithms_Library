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
//    private String studentId;
//    private String bookid;
//    private boolean borrowed; // should be indivisual class? or Book class?
//    private int borrowed_date;//no need?
//    private int returned_date;//no need?    

    //attributs
    private int borrowId;//to track history
    private String studentId;
    private String bookid;
    private boolean borrowed; // should be indivisual class? or Book class?
    private int borrowed_date;//no need?
    private int returned_date;//no need?   

    private static int currentBorrowIdNumber = 0; //

    //constructors   object
//    public BorrowingList() {
//        this.studentId = studentId;
//        this.bookid = bookid;
//        this.borrowed = false;  // we can just check thee is someoone in Waitinglist?
//        this.borrowed_date = borrowed_date;
//        this.returned_date = returned_date;
//    }
    public BorrowingList() {
        this.borrowId = borrowId;
        this.studentId = studentId;
        this.bookid = bookid;
        this.borrowed = false; //at first, every book are not borrowed
//        this.borrowed_date = borrowed_date;
//        this.returned_date = returned_date;

    }

    public BorrowingList(String studentId, String bookid) {
        this.borrowId = borrowId;
        this.studentId = studentId;
        this.bookid = bookid;
        this.borrowed = false;
        this.borrowed_date = borrowed_date;
        this.returned_date = returned_date;

    }

    //Method
    //creat a new borrowed book //REFERENCE https://www.thestudentroom.co.uk/showthread.php?t=2441484
    public String getStudentId() {
        return studentId;
    }

    public String getBookid() {
        return bookid;
    }
    // BorroweID creation 
    public int generateBorrowID() {
        this.currentBorrowIdNumber++;
        return this.currentBorrowIdNumber;
    }

    //check it is borrowed or not
    public boolean isBorrowed() {
        return borrowed;
    }

    //change status as borrowed if studentid and bookid is input  //make sence??
    public boolean bookborrowed() {
        if ((this.studentId!= null)&&(this.bookid!= null)); 
        this.borrowed = true;
        
        return this.borrowed;
        
    }
   
    // when it returned, status is back to false
    public void returned() {
    borrowed = false;
    }

    //add to borrowinglis?
    public static ArrayList<BorrowingList> Borrowinglistrecords(ArrayList<BorrowingList> StudentId, ArrayList<BorrowingList> bookid ){
			
			ArrayList<BorrowingList> resultList = new ArrayList<BorrowingList>();
                        return resultList;
    }	
    
    
    

			
//
//if the book borrowed, register into the Borrowinglist
    public String borrowBook( ArrayList<Book> books,ArrayList<Student> students,int studentIndex,int bookIndex ){
//        
            String studentId = students.get(studentIndex-1).getStudentId();
            String bookid = books.get(bookIndex-1).getId();
//            
            System.out.println("Registered in borrowing book : " + studentId + bookid); 
            
            
            
             
            System.out.println(getStudentId() + " has borrowed " + getBookid());
          return null;
//       
//            waitingQueue.addStudent(student);
//            System.out.println(student.getName() + " is added to the waiting queue for " + getTitle());
        }
        


public String registerBorrowing(String id_reader, String id_book ){
            return id_reader;

}
       
            

            


    public int getBorrowId() {
        return borrowId;
    }
    
    
    //input which book is asked to be borrowed
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    
    //input student who wants to borrow  book
        public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    //Librarian can set borrowed or not
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setBorrowed_date(int borrowed_date) {
        this.borrowed_date = borrowed_date;
    }

    public void setReturned_date(int returned_date) {
        this.returned_date = returned_date;
    }

    public int getBorrowed_date() {
        return borrowed_date;
    }

    public int getReturned_date() {
        return returned_date;
    }



    

    @Override
    public String toString() {
        return "BorrowingList{" + "borrowId=" + generateBorrowID() + ", studentId=" + studentId + ", bookid=" + bookid + ", borrowed=" + borrowed + ", borrowed_date=" + borrowed_date + ", returned_date=" + returned_date + '}';
    }
    
}
