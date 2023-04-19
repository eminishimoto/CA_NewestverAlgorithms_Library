/* This LibraryMenu illustrate Controll of Menu
 * 
 * 
 */
package Contoroller;

import Library.InputUtilsLB;
import Library.Library;
import Models.Book;
import Models.BorrowingList;
import Models.Searching;
import Models.Sorting;
import Models.Student;
import Models.WaitingList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emi
 */
//menue methods 
public class LibraryMenu {

    //Read files  
    Readfiles RF = new Readfiles(); //?new Readfiles is better?
    //     System.out.println("RF.loadData()"+RF.loadData());
    //     System.out.println("RF.toString()"+RF.toString());

    ArrayList<Book> books = RF.loadData(); //store the Bookrecord from Readfile in books to make it work in this clas
    ArrayList<Student> students = RF.loadData2();//store the Studentrecord 
//               SearchFile s1 = new SearchFile(calling1);         

    InputUtilsLB myInput = new InputUtilsLB();

    // Show message  
    public LibraryMenu() { //void or String?

        System.out.println(
                "********************Welcome to the Library!********************");
        System.out.println(
                "                  Select From The Following Options:               ");
        System.out.println(
                "***************************************************************");
    }

    // Display option. used inseide optionSwitch() method
    public void dispMenu() {
        System.out.println(
                "-----------------------------------------------------------------------------");
        System.out.println("Enter 0 to Exit Application");
        System.out.println("Enter 1 to Search a Book");
        System.out.println("Enter 2 to Sort Books");
        System.out.println("Enter 3 to Search a Student");
        System.out.println("Enter 4 to Sort a Student");
        System.out.println("Enter 5 to ");
        System.out.println("Enter 6 to ");
        System.out.println("Enter 7 to  ");
        System.out.println("Enter 8 to ");
        System.out.println("------------------------------------------------------------------");
    }

//rEFERENCEhttps://codereview.stackexchange.com/questions/206615/a-student-library-program-in-java
// https://www.scribd.com/document/636334916/20MID0209-JAVA-DA-1#  
    //Ask user to select from above optuons using switch  
    public void optionSwitch() {
        // Creating object of Scanner class to take input from user 
        Scanner input = new Scanner(System.in);
        // Creating object of book class
        Book ob = new Book();
        // Creating object of students class
        Student obStudent = new Student();

        Searching mySearch = new Searching();

// 
        int choice;
        int searchChoice1;
        int searchChoice3;
        // Creating menu
        // using do-while loop
        do {

            dispMenu();//above
            choice = input.nextInt();

            // Switch case
            switch (choice) {

                // Linearsearch
                case 1:
                    System.out.println(" press 1 to Search Book by Title");
                    System.out.println(" Press 2 to Search Book by Author Name");
                    searchChoice1 = input.nextInt();

//                // Nested switch
                    switch (searchChoice1) {
// 
//                    // Case
                        case 1:
                            //instead of this, could make this as a method in Searching class? mySearch.callmethod           
                            String calling10 = myInput.getUserText("Which Title would you like to search?");
                            String lineaResult1 = mySearch.linearSearchbytitle(books, calling10);//store the result from Searching class 
                            System.out.println(lineaResult1);//result
                            break;
// 
//                    // Case
                        case 2:
                            String calling11 = myInput.getUserText("Which Author name would you like to search?");
                            String lineaResult2 = mySearch.linearSearchbyname(books, calling11);
                            System.out.println(lineaResult2);//result
                    }
                    break;

                // Sort
                case 2:

                    Sorting bubble = new Sorting();

                    Book[] bookArr = new Book[books.size()];

                    for (int i = 0; i < books.size(); i++) {

                        bookArr[i] = books.get(i);
                    }
                    bubble.bubbleSort(bookArr);

                    for (Book b : bookArr) {
                        System.out.println("Title: " + b.getBook_title());
                        System.out.println(" Written By : " + b.getAuthor_first_name() + " " + b.getAuthor_last_name());
                    }
                    break;

//              // Linearsearch 
//                            // Case
                case 3:
                    System.out.println(" press 1 to Search Student by ID");
                    System.out.println(" Press 2 to Search Student by Name");
                    searchChoice3 = input.nextInt();
// 
//                // Nested switch
                    switch (searchChoice3) {
// 
//                    // Case
                        case 1:
                            String calling13 = myInput.getUserText("Which Student id  would you like to search?");
                            String lineaResult4 = mySearch.linearSearchbyStudentId(students, calling13);
                            System.out.println(lineaResult4);
                            break;
//                    // Case
                        case 2:
                            String calling12 = myInput.getUserText("Which Student name would you like to search?");
                            String lineaResult3 = mySearch.linearSearchbyStudentname(students, calling12);//store the result from Searching class 
                            System.out.println(lineaResult3);

                    }
                    break;

                // Sort
//             // Case
                case 4:
                    Sorting insert = new Sorting();

                    Student[] studentArr = new Student[students.size()];
                    for (int i = 0; i < students.size(); i++) {
                        studentArr[i] = students.get(i);
                    }
                    insert.insertionSort(studentArr);
                    Student student = null;
                    for (Student s : studentArr) {
                        if (student == null || !student.getStudentFirst().equals(s.getStudentFirst())) {
                            System.out.println("Student first Name: " + s.getStudentFirst());
                            System.out.println("Students full Name: " + s.getStudentFirst() + " " + s.getStudentLast());
                        }
                        student = s;
                    }
                    break;

//                
//                // Case
//            case 5:
//                student s = new student();
//                obStudent.addStudent(s);
//                break;
// 
//                // Case
//            case 6:
//                obStudent.showAllStudents();
//                break;
// 
//                // Case
//            case 7:
//                obStudent.checkOutBook(ob);
//                break;
// 
//                // Case
//            case 8:
//                obStudent.checkInBook(ob);
//                break;
//               // Case
//            case 9:
//                obStudent.checkInBook(ob);
//                break;
//                
//                              // Default case that will execute for sure
//                // if above cases does not match
//
                default:

                    // Print statement
                    System.out.println("ENTER BETWEEN 0 TO 9.");
            }

// 
//        // Checking condition at last where we are
//        // checking case entered value is not zero
//    
        } while (choice != 0);
    }

    public void libraryMenu() {
        System.out.println(
                "********************Welcome to the Library!********************");
        System.out.println(
                "                  Select From The Following Options:               ");
        System.out.println(
                "***************************************************************");
    }

}
