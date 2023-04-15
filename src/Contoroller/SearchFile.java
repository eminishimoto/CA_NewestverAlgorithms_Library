/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoroller;

import Library.InputUtilsLB;
import Library.Library;
import Models.Book;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emi
 */
public class SearchFile {
 
    
    public SearchFile(String input){
       //create Book arraylist called records 
       ArrayList<Book> records = loadData(); //*it's duppulicate. same code from Readfile  
//        ArrayList<Book> records = new ArrayList<>();
       //search name from input
            InputUtilsLB myInput = new InputUtilsLB(); 
     
//        String calling1 = myInput.getUserText("What would you like to search?");
       System.out.println(linearSearchbyname(records, input));
      
               
             
//       String calling2 = myInput.getUserText("What would you like to search?");
       System.out.println(linearSearchbytitle(records, input));
               
    }
    
    //search title from input 
    //DOSE NOT WORK BECAUSE OF SearchingFile is only one
//       public SearchFile2(String input2){
//       ArrayList<Book> records = loadData();  
//       System.out.println(linearSearchbytitle(records, input2));
//    }
       


//HOW TO READ THOSE FROM READ FILE? SEARCH DID NOT WORK
//Readfile part
//*it's duppulicate. same code from Readfile   
    public ArrayList<Book> loadData() {
        
        ArrayList<Book> records = new ArrayList<>();//now records is a new ArrayList
        
        try {//read the file "MOCK_DATA.csv"
            BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"));
            //contentline is reading line by line from bufferedReader
            String contentLine = br.readLine();
            
            //set objects
            String[] data; //one line is a data
            String id;//elements of a data
            String author_first_name;
            String author_last_name;
            String book_title;
            String genre;

            
            //until the line is null
            while (contentLine != null) {
                //split contents of data with "," to define each elements with position
                data = contentLine.split(",");
                id = (data[0]);
                author_first_name = data[1];
                author_last_name = data[2];
                book_title = data[3];
                genre= data[4];

                //adding data above to Bookclass
                records.add(new Book(id, author_first_name, author_last_name, book_title));
                contentLine = br.readLine();
            }
            //use try catch in case there is no name which are given?
            //*Logger.getLogger https://www.javatpoint.com/post/java-system-getlogger-method#:~:text=The%20getLogger()%20method%20of,be%20used%20for%20caller's%20use.
        } catch (IOException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if there is names, return records
        return records;
    }
    
 //Searching part                                    
 //search by name                                     //this array is record
    public String linearSearchbyname(ArrayList<Book> array, String targetName){
        
        // Going one by one the elements in the array
        for(int i = 0; i < array.size(); i++){ //i is position
            System.out.println("Testing: " + array.get(i).getAuthor_first_name());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getAuthor_first_name().equals(targetName)){
                return "The Name Found :"+array;//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Name not found";
        
        
    }
    
 //search by title                                     //this array is record
        public String linearSearchbytitle(ArrayList<Book> array, String targetTitle){
        
        // Going one by one the elements in the array
        for(int i = 0; i < array.size(); i++){ //i is position
            System.out.println("Testing: " + array.get(i).getBook_title());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getBook_title().equals(targetTitle)){
                return "The Title Found :"+array;//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Title not found";  
}
 //Binary Searching part                                    
 //search by name                                     //this array is record
//    public String BinarySearchbyname(ArrayList<Book> array, String targetName){
//        Collections.sort(array);// for sorting. pass array
//       //binary serach only work sorted data. for sorting
//       
//        System.out.println("Printing sorted array: " + array);
//        int left = 0, 
//        int right = array.size - 1;
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
// 
//            int res = targetName.compareTo([middle]);
// 
//            // Check if x is present at mid
//            if (res == 0)
//                return middle;
// 
//            // If x greater, ignore left half
//            if (res > 0)
//                left = middle + 1;
// 
//            // If x is smaller, ignore right half
//            else
//                right = middle - 1;
//        }
// 
//        return -1;
//    }

            }
                
            
   

        
        