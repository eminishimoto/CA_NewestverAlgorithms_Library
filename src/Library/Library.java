/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Library;

import Contoroller.LibraryMenu;
import Models.Student;

import Contoroller.Readfiles;
import Models.Book;
import Models.BorrowingList;
import Models.Searching;
import Models.Sorting;
import Models.WaitingList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emi
 */
public class Library {

    

    
    //attribute as arraylists  from Model class 
    private ArrayList<Book> books; //data need to be read from csv  //changed from booklist
    private ArrayList<Student> students;//data  read from txt or random generate? //changed from studentlist
    private ArrayList<WaitingList> waitinglist;
    private ArrayList<BorrowingList> borrowinglist;

    //constructor
    public Library() {
        this.books = new ArrayList<Book>(); //= booklist;
        this.students = new ArrayList<Student>();//studentlist;
        this.waitinglist = new ArrayList<WaitingList>();//witinglist;
        this.borrowinglist = new ArrayList<BorrowingList>();//borrowinglist;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Search    
     InputUtilsLB myInput = new InputUtilsLB(); 
        //search by first name
//        String calling1 = myInput.getUserText("Which author would you like to search?");
//               SearchFile s1 = new SearchFile(calling1);
//        System.out.println(s1);

 //show menu      
        LibraryMenu lmenu= new LibraryMenu ();
        
       //ask password- anything above 4 letters/numbers are fine
       lmenu.password();
       
       //show option menu
       lmenu.optionSwitch();
       
       Library mly = new Library();
     
       
//Read files  --> inside Library menu
//        Readfiles RF = new Readfiles(); //?new Readfiles is better?
//        //     System.out.println("RF.loadData()"+RF.loadData());
//        //     System.out.println("RF.toString()"+RF.toString());
//        System.out.println(RF.toString());
//
//        ArrayList<Book> books = RF.loadData(); //store the Bookrecord from Readfile in books to make it work in this clas
//        ArrayList<Student> students = RF.loadData2();//store the Studentrecord 
////               SearchFile s1 = new SearchFile(calling1);         

//        InputUtilsLB myInput = new InputUtilsLB();
//   BorrowingList     test
//        System.out.println(books.get(7).getBook_title());
//        books.get(6).getAuthor_first_name();
//
//   BorrowingList     test   
        BorrowingList bwl = new BorrowingList();
         System.out.println("This is the empty borrowinglist :" + bwl.toString());
//         
//  
//        //check borrowed status
//        boolean register1 = bwl.isBorrowed();
//        System.out.println(" Is this book borrowed?" +register1);
//        
//        //abut borrowing
       String calling4 = myInput.getUserText("Input book ID");
       bwl.setBookid(calling4);//want to add book to borrowing list for specific student
       
       String calling5 = myInput.getUserText("Input student ID");
       bwl.setStudentId(calling5);//want to add book to borrowing list for specific student
//  　doesn't work     
//          String calling6 = myInput.getUserText("Input student ID"); 
//    String calling7 = myInput.getUserText("Input book ID");  
//  bwl.registerBorrowing(calling6, calling7);
       
 
       //generate BorrowID for this student
       bwl.generateBorrowID();
       
       //change borrowedstatus = this book is borrowed now
       bwl.bookborrowed();
       System.out.println("Book borrowed " );
               
       //show the borrowinglist again
       System.out.println("This is the updated borrowinglist :" + bwl.toString());
       
        ArrayList<BorrowingList> bArray = new ArrayList<BorrowingList>();
       System.out.println("Added to borrowing list!" + bArray.add(bwl));
        System.out.println(bArray.toString());
          WaitingList WL = new WaitingList();
//       mly.registerBorrow(bArray, calling4, calling5);
       
       
       
       //other student want to borrrow same book
       
       //book returned
//       bwl.returned(); 
       System.out.println("Book returned " );
       
      //show the borrowinglist again
       System.out.println("This is the updated borrowinglist :" + bwl.toString());
       
//       Library myl = new Library();
//       myl.registerBorrow();
       

       
       
//       
//       String calling5 = myInput.getUserText("This is borrowing list for the student"  );   
//        System.out.println("" + myStudent.getBorrowinglist(calling4));

         

    
       //check if this book is avairable
//        WaitingList WL = new WaitingList();  
//        System.out.println("Check the Waiting List");          
//        System.out.println("Is this book avairable now?" +  WL.isEmpty());
//        
//        String calling6 = myInput.getUserText("Register student for the waiting queue?");
//        WL.Enqueue(calling6);
//        System.out.println("This is the queue now :" + WL.toString());

//        
//         System.out.println("Check the Waiting List");          
//        System.out.println("Is this book avairable now?" +  WL.isEmpty());
//        
       //is isEmpty=true, student can borrow if not input the queue
       //is isEmpty=false, student enqueue
//       if(WL.isEmpty()== false){
//           System.out.println("The Book is borrowed. Please book in WaitingList");
////           WL.Enqueue(newElement);
//           
//       }//register the book
//       else{
//           System.out.println("The Book is avairable. Please input borrowingnote");
//           
//       }
//       
//       













//        Searching mySearch = new Searching();//want to use book array
////Binary waiting for sorting part
////        String calling9 = myInput.getUserText("Which Title would you like to search?");
////        String lineaResult =  mySearch.binarySearch(books, calling9);//store the result from Searching class 
////        System.out.println("test result" +  lineaResult );

//--> inside Library menu
////Linear Studebt
//        String calling12 = myInput.getUserText("Which Student name would you like to search?");
//        String lineaResult3 = mySearch.linearSearchbyStudentname(students, calling12);//store the result from Searching class 
//        System.out.println( lineaResult3);//result
//
//        String calling13 = myInput.getUserText("Which Student id  would you like to search?");
//        String lineaResult4 = mySearch.linearSearchbyStudentId(students, calling13);
//        System.out.println( lineaResult4);//result
////Linear Book
//        String calling10 = myInput.getUserText("Which Title would you like to search?");
//        String lineaResult1 = mySearch.linearSearchbytitle(books, calling10);//store the result from Searching class 
//        System.out.println( lineaResult1);//result
//
//        String calling11 = myInput.getUserText("Which Author name would you like to search?");
//        String lineaResult2 = mySearch.linearSearchbyname(books, calling11);
//        System.out.println( lineaResult2);//result

    
        


//--> inside Library menu
//list books by titles and authors     
//        Sorting bubble = new Sorting();
//
//        Book[] bookArr = new Book[books.size()];
//
//        for (int i = 0; i < books.size(); i++) {
//
//            bookArr[i] = books.get(i);
//        }
//        bubble.bubbleSort(bookArr);
//
//        for (Book b : bookArr) {
//            System.out.println("Title: " + b.getBook_title());
//            System.out.println(" Written By : " + b.getAuthor_first_name() + " " + b.getAuthor_last_name());
//        }
        
        
        
        //          ArrayList<Student> students = RF.loadData2();
//            Sorting bubble1 = new Sorting();
//       
//           Student[] studentArr = new Student[students.size()];
//       
//           for(int i = 0; i<students.size();i++){
//       
//           studentArr[i]=students.get(i);
//    }
//           bubble.bubbleSort1(studentArr);
// 
//           for (Student b : studentArr) {
//                System.out.println("Student first : " + b.getStudentFirst());
//                System.out.println(" Student  full name : " + b.getStudentFirst() );
//       }   
        //      + " " + b.getStudentLast()

//                   ArrayList<Student> students = RF.loadData2();


//--> inside Library menu
//        Sorting insert = new Sorting();
//
//        Student[] studentArr = new Student[students.size()];
//        for (int i = 0; i < students.size(); i++) {
//            studentArr[i] = students.get(i);
//        }
//        insert.insertionSort(studentArr);
//        Student student = null;
//        for (Student s : studentArr) {
//            if (student == null || !student.getStudentFirst().equals(s.getStudentFirst())) {
//                System.out.println("Student first Name: " + s.getStudentFirst());
//                System.out.println(" Students full Name: " + s.getStudentFirst() + " " + s.getStudentLast());
//            }
//            student = s;
//        }
 



        //        for (int i = 0; i < students.size(); i++) {
//        
//        studentArr[i] = students.get(i);
//  }
//        insert.insertionSort(studentArr);
//
//        for (Student s : studentArr) {
//        System.out.println("Students Name: " + s.getStudentFirst() + " " + s.getStudentLast() );
//}
    }
    
// Register borrowing
    public  void registerBorrow(ArrayList<BorrowingList> borrowed, String bookid, String studentId) {
        Library myl = new Library();
        
        Scanner myInput = new Scanner(System.in);
//        String borrowID, String studentId, String bookid;
//        System.out.println("Input book ID");
//        bookid = myInput.nextLine();
//        System.out.println("Input student ID:");
        studentId = myInput .nextLine();

        for (BorrowingList bwl : borrowed) {
            if (bwl.getBookid().equals(bookid) && bwl.isBorrowed()== true) {
                
                System.out.println("Book is already borrowed.");
                System.out.println("Please add the student to the waiting list.");
                borrowed.add(bwl);
                 WaitingList wl = new WaitingList();
                    wl.Enqueue(studentId);
                    System.out.println("added to the waiting list.");
//                    return;
                } else {
//                    return;
                }
            }
        }
 
}



       

    


