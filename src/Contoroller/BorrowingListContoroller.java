/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoroller;

import Models.BorrowingList;
import Models.WaitingList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emi
 */
public class BorrowingListContoroller {
    
     BorrowingList bwl = new BorrowingList();
    
                     //add to borrowinglis?
    public static ArrayList<BorrowingList> Borrowinglistrecords(ArrayList<BorrowingList> StudentId, ArrayList<BorrowingList> bookid ){
			
			ArrayList<BorrowingList> resultList = new ArrayList<BorrowingList>();
                        return resultList;
    }	
    
// Register borrowing
//    public static void registerBorrow(ArrayList<BorrowingList> borrowed, ArrayList<WaitingList> waitinglist) {
//        char option;
//        Scanner in = new Scanner(System.in);
//        String borrowID, studentId, bookid;
//        System.out.println("Input book ID");
////        bookid = in.nextLine();
//        System.out.println("Input student ID:");
//        studentId = in.nextLine();
//
//        for (BorrowingList bwl : borrowed) {
//            if (bwl.getBookid().equals(bookid) && bwl.isBorrowed()== true) {
//                
//                System.out.println("Book is already borrowed.");
//                System.out.println("Please add the student to the waiting list.");
//                
//                
//                    addToWaitingList(waitinglist, bookid, studentId);
//                    System.out.println("added to the waiting list.");
//                    return;
//                } else {
//                    return;
//                }
//            }
//        }
//
//        
//        //generate BorrowID for this student
//       bwl.generateBorrowID();
//       
//        BorrowingList bwl = new BorrowingList(borrowID, studentId, bookid);
//        borrowing.add(bwl);
//        System.out.println("Borrowing registered for the student");
//    }
//    
}
