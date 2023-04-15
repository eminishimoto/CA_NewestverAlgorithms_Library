/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Library;

import Contoroller.LibraryMenu;
import Models.Student;

import Contoroller.Readfiles;
import Contoroller.SearchFile;
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

    private static Student studentId;
      //attribute as arraylists  from Model class 
    	private ArrayList<Book> booklist; //data need to be read from csv
	private ArrayList<Student> studentlist;//data  read from txt or random generate?
	private ArrayList<WaitingList> waitinglist;
        private ArrayList<BorrowingList> borrowinglist;
        
    //constructor
    public Library() {
        this.booklist=  new ArrayList<Book>(); //= booklist;
        this.studentlist = new ArrayList<Student>();//studentlist;
        this.waitinglist = new ArrayList<WaitingList>();//witinglist;
        this.borrowinglist = new ArrayList<BorrowingList>();//borrowinglist;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//
////Search    
//     InputUtilsLB myInput = new InputUtilsLB(); 
//        //search by first name
//        String calling1 = myInput.getUserText("Which author would you like to search?");
//               SearchFile s1 = new SearchFile(calling1);
////        System.out.println(s1);
  

 //Read files  
        Readfiles RF = new Readfiles(); //?new Readfiles is better?
 //     System.out.println("RF.loadData()"+RF.loadData());
 //     System.out.println("RF.toString()"+RF.toString());
         System.out.println( RF.toString());
         
         
        ArrayList<Book> books = RF.loadData(); //store the Bookrecord from Readfile in books to make it work in this clas
        ArrayList<Student> students = RF.loadData2();//store the Studentrecord 
//               SearchFile s1 = new SearchFile(calling1);         

        InputUtilsLB myInput = new InputUtilsLB(); 
        
        System.out.println(books.get(7).getBook_title());
//        books.get(6).getAuthor_first_name();
//
//      
        BorrowingList bwl = new BorrowingList();
        bwl.borrowBook(books, students, 34, 53);
        System.out.println(bwl.toString());
//        
////BorrowingList        
//          BorrowingList BL =   new BorrowingList();
//          System.out.println("This is borrowinglist" + BL);
//          BL.setBookid(myBook);
       
          
//            p.setName ("Tolga"); //set name for p:Programmer class
//  p.coding ("Python"); //set constractor:coding
//    System.out.println(p.eat(p.getName()));
//    System.out.println("This is our first programmer " + p);//設定したattributeが表示
//    
//        System.out.println("p.getName()" + p.getName());
//        
//        p.setCompanyName("CCT");
//        
//       p.showProfile(p.getName());
          
          
          
         
          Searching mySearch = new Searching();//want to use book array
//Binary waiting for sorting part
//        String calling9 = myInput.getUserText("Which Title would you like to search?");
//        String lineaResult =  mySearch.binarySearch(books, calling9);//store the result from Searching class 
//        System.out.println("test result" +  lineaResult );
        
//Linear
        String calling10 = myInput.getUserText("Which Title would you like to search?");
        String lineaResult1 =  mySearch.linearSearchbytitle(books, calling10);//store the result from Searching class 
                 System.out.println("test result" +  lineaResult1 );
        
        
        String calling11 = myInput.getUserText("Which author name would you like to search?");
        String lineaResult2 =  mySearch.linearSearchbyname(books, calling11);
                System.out.println("test result" +  lineaResult2 );
                
                
                
                       //list books by titles and authors     
           Sorting bubble = new Sorting();
       
           Book[] bookArr = new Book[books.size()];
       
           for(int i = 0; i<books.size();i++){
       
           bookArr[i]=books.get(i);
    }
           bubble.bubbleSort(bookArr);
 
           for (Book b : bookArr) {
                System.out.println("Title: " + b.getBook_title());
                System.out.println(" Written By : " + b.getAuthor_first_name() + " " + b.getAuthor_last_name());
       }

//                   ArrayList<Student> students = RF.loadData2();
        Sorting insert = new Sorting();
        
        Student[] studentArr = new Student[students.size()];
            for (int i = 0; i < students.size(); i++) {
                studentArr[i] = students.get(i);
            }
                insert.insertionSort(studentArr);
            Student student = null;
            for (Student s : studentArr) {
            if(student == null || !student.getStudentFirst().equals(s.getStudentFirst())){
                System.out.println("Student first Name: " + s.getStudentFirst());
            System.out.println("Students full Name: " + s.getStudentFirst() + " " + s.getStudentLast() );
}
            student = s;
            }
       }
    }
//       LibraryMenu LM = new LibraryMenu() ; 
//       System.out.println("show menu" +  LM); //? 
//       
//
//       
       
       
//    
//       //check if this book is avairable
//        WaitingList WL = new WaitingList(3);  //instanciate we only have constructer with capacity
//        System.out.println("Check the Waiting List");          
//        System.out.println("Is this book avairable now?" +  WL.isEmpty());
//        
//        String calling3 = myInput.getUserText("Register student for the waiting queue?");
//        WL.Enqueue(calling3);
//        System.out.println("This is the queue now :" + WL.toString());
//        System.out.println(WL.showdata()); //doesnt work
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
//       //abut borrowing
//       String calling4 = myInput.getUserText("Register book for the student");
//       myStudent.setBorrowinglist(myBook);//want to add book to borrowing list for specific student
//       
//       String calling5 = myInput.getUserText("This is borrowing list for the student"  );   
//        System.out.println("" + myStudent.getBorrowinglist(calling4));


    


