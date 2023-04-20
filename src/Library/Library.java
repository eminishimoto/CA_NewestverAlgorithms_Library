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

        Library mly = new Library();
       //for input  
        InputUtilsLB myInput = new InputUtilsLB();

        //show menu      
        LibraryMenu lmenu = new LibraryMenu();

       //ask password - anything above 4 letters/numbers are fine
        lmenu.password();

        //show option menu 
        lmenu.optionSwitch();

    }

}



       

    


