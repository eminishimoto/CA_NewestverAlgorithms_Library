/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author emi
 */
public class Student {
    
        // attribute
    private String studentId;
    private String studentFirst;
    private String studentLast;
    private String gender;
    private String country;
//    private String[] borrowinglist;//?

    
    //constructor
    public Student(){}
    public Student(String studentId){}
    
    public Student(String studentId, String studentFirst, String studentLast, String gender,String country) {
        this.studentId = studentId;
        this.studentFirst = studentFirst;
        this.studentLast = studentLast;
        this.gender = gender;
        this.country = country;
//        this.borrowinglist = borrowinglist; //?
    }

    @Override
    public String toString() {
        return this.studentFirst;
    }

    
    
    public String getStudentId() {
        return studentId;
    }

    public String getStudentFirst() {
        return studentFirst;
    }

    public String getStudentLast() {
        return studentLast;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

//    public String[] getBorrowinglist(String studentId) {
//        return borrowinglist;
//        
//    }
 
    
//    /**
//     *
//     * @param bookid
//     */
//    public void setBorrowinglist(Book bookid) {
//        this.borrowinglist = borrowinglist;
//    }
}
