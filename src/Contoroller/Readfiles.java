/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoroller;

import Library.Library;
import Models.Book;
import Models.Student;
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
public class Readfiles {

    //Read from files
    public Readfiles() {

        //create arraylist called records 
        ArrayList<Book> records = loadData();
        System.out.println("...The Book file is stored" +" \n..."+ records + " \n");
        
        ArrayList<Student> records2 = loadData2();
        System.out.println("...The Student file is stored" + " \n..." + records2 + " \n");
        

    }
    

    //loadData Book 
    public ArrayList<Book> loadData() {

        ArrayList<Book> records = new ArrayList<>();//create ArrayList

        try {//read the file"tMOCK_DATA.csv"
            BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"));
            //contentline is reading line by line from bufferedReader
            String contentLine = br.readLine();

            //set objects
            String[] data; //one line is a data
            String bookid;//elements of a data
            String author_first_name;
            String author_last_name;
            String book_title;
//            String genre;

            //until the line is null
            while (contentLine != null) {
                //split contents of data with "," to define each elements with position
                data = contentLine.split(",");
                bookid = data[0]; //position0
                author_first_name = data[1];//position1
                author_last_name = data[2];//position2
//                book_title = data[3];//position3
                //Title are separated from space
                book_title = "";   
                 for(int i=3; i<data.length-1; i++) {
                    book_title += data[i];
                }

//                genre = data[4];//position4
                
                //adding elements into Arraylist records                                               some title has " . to remove them https://tech.pjin.jp/blog/2018/04/28/java_how_to_escape/
                records.add(new Book(bookid, author_first_name, author_last_name, book_title.replace("\"", "")));
                contentLine = br.readLine();
            }
            //use try catch in case there is no name which are given?
            //*Logger.getLogger https://www.javatpoint.com/post/java-system-getlogger-method#:~:text=The%20getLogger()%20method%20of,be%20used%20for%20caller's%20use.
        } catch (IOException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        //now record has all data
        return records;
    }

    //loadData Student
    public ArrayList<Student> loadData2() {

        ArrayList<Student> records2 = new ArrayList<>();//now records is a new ArrayList

        try {//read the file"test.txt"
            BufferedReader br2 = new BufferedReader(new FileReader("test.txt"));
            //contentline is reading line by line from bufferedReader
            String contentLine = br2.readLine();

            //set objects
            String[] data; //one line is a data
            String studentId;//elements of a data
            String studentFirst;
            String studentLast;
            String gender;
            String country;

            //until the line is null
            while (contentLine != null) {
                //split contents of data with "," to define each elements with position
                data = contentLine.split(",");
                studentId = (data[0]);
                studentFirst = data[1];
                studentLast = data[2];
                gender = data[3];
                country = data[4];
                
                //
                records2.add(new Student(studentId, studentFirst, studentLast, gender, country));
                contentLine = br2.readLine();
            }
            //use try catch 
            //*Logger.getLogger https://www.javatpoint.com/post/java-system-getlogger-method#:~:text=The%20getLogger()%20method%20of,be%20used%20for%20caller's%20use.
        } catch (IOException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if there is names, return records
        return records2;





}

}