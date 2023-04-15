/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author emi
 */
public class Book implements Comparable{  //data = MOCK_DATA.csv
    
    // attribute
    private String bookid;
    private String author_first_name;
    private String author_last_name;
    private String book_title;
    
//    private String genre;//no neeed
    
    //def  constructor
//    public Book() {}
    //constructor
    public Book(String bookid, String author_first_name, String author_last_name, String book_title) {
        this.bookid = bookid;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.book_title = book_title;
//      this.genre = genre; //no neeed  
    }
    
    //method
    //getter  need?
    public String getId() {
        return bookid;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public String getBook_title() {
        return book_title;
    }


    
//    //setter
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setAuthor_first_name(String author_first_name) {
//        this.author_first_name = author_first_name;
//    }
//
//    public void setAuthor_last_name(String author_last_name) {
//        this.author_last_name = author_last_name;
//    }
//
//    public void setBook_title(String book_title) {
//        this.book_title = book_title;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
  
    @Override
    public String toString() {
        return book_title;
    }

    @Override
    public int compareTo(Object o) {
        return this.book_title.compareTo(o.toString());
    }

    
            
    
    
   
    
    
    
}
