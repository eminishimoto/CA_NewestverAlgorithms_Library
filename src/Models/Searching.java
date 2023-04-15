/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Library.InputUtilsLB;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author emi
 */
public class Searching {

//    public Searching( ArrayList<Book> array, String target) {
//
//        // Creating array and populating it - this is not part of the algorith
////        ArrayList<String> array = new ArrayList<>();//BOOK?
//               //search name from input
//       InputUtilsLB myInput = new InputUtilsLB(); 
////        String target = myInput.getUserText(prompt);
//        
//
//        System.out.println("LINEAL SEARCH");
//        // Searching in the array using lineal search
//        System.out.println(linearSearch(array, target)); //linersearch method is bellow
//
////        System.out.println("BINARY SEARCH");
////        // Searching in the array using lineal search
////        System.out.println(binarySearch(array, target)); //binarysearch method is bellow
//
//        int index = linearSearch(array, target);
//
//        if (index == -1) {
//            System.out.println("There is no element");
//        } else {
//            System.out.println("The element is " + target + "is in the position  " + index);
//        }
//    }

    /*
     * This method will receive an array and a value to be searched in the array
     */
//    public int linearSearch(ArrayList<Book> array, String target) {
//        for (int i = 0; i < array.size(); i++) { //instead length use size.
//            System.out.println("testing element in position" + i);
//            if (array.get(i) == target) {
//                return i;
//            }
//        }
//
//        return -1;// if there is no the number in the array, return position-1
//    }
    /*
     * This method will receive an array and a value to be searched in the array
     */
//    public int binarySearch(ArrayList<Book> array, String target) {
//
//        Collections.sort(array);
//        System.out.println("Printing sorted array: " + array);
//
//        int left = 0;
//        int right = array.size() - 1; //set right as size -1
//        while (left <= right) { //untill the both point in the same , continue
//            int mid = (left + right) / 2; //set the middle
//            int result= target.compareTo(array.get(mid));
//            System.out.println("testing element in position" + mid);
//            if (result == 0) { //the easiest is the mid is the target
//                return mid;
//
//            } else if (result < 0) {//there are two possible condition, left and right
//                right = mid - 1; //the starting point goes puls one
//            } else {
//                left = mid + 1;
//
//            }
//        }
//
//        return -1;
//
//
//    
//}
 
//Searching part 
 //search by title                                     //this array is record
        public String linearSearchbytitle(ArrayList<Book> array, String targetTitle){
        
        // Going one by one the elements in the array
        for(int i = 0; i < array.size(); i++){ //i is position
            System.out.println("Testing: " + array.get(i).getBook_title());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getBook_title().equalsIgnoreCase(targetTitle)){
                return "The Title Found : "+array;//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Title not found";  
}
                                    
 //search by name                                     //this array is record
    public String linearSearchbyname(ArrayList<Book> array, String targetName){
        
        // Going one by one the elements in the array
        for(int i = 0; i < array.size(); i++){ //i is position
            System.out.println("Testing: " + array.get(i).getAuthor_first_name());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getAuthor_first_name().equalsIgnoreCase(targetName)){
                return "The Name Found :"+array;//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Name not found";
}
    
    

}