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
        
                    System.out.println("-----------");
                    System.out.println("-- Searching by Book Title --");
        //eliminate space and comma           
        String NewtargetTitle = targetTitle.replace(" ", "").replace(",", "");
        
        // searching one by one the elements in the array
        for(int i = 1; i < array.size(); i++){ //i is position
            System.out.println( "..." + array.get(i).getBook_title());//shows elements until the target found. not neccesarry but good to see processing
            // When the element matched with the target, stop the loop and return the index
            if((array.get(i).getBook_title().replace(" ", "").equalsIgnoreCase(NewtargetTitle))){
                return "The Title Found : "+ targetTitle  + array.get(i).showBookInfo();//show array=info of the book  ;
                
                
            }            
        }
        //if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Title NOT found. Spelling correct? Try again.";  
  
}
                                    
 //search by name                                     //this array is record
    public String linearSearchbyname(ArrayList<Book> array, String targetName){
        
        
         System.out.println("-----------");
         System.out.println("-- Searching by Author Name --");
        
        String NewtargetName = targetName.replace(" ", "");
        // Going one by one the elements in the array
        for(int i = 1; i < array.size(); i++){ //i is position
            System.out.println( "..." + array.get(i).getAuthor_Fullname());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getAuthor_Fullname().replace(" ", "").equalsIgnoreCase(NewtargetName )){
                return "The Name Found : " + targetName + array.get(i).showBookInfo();//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Name NOT found. Spelling correct? Try again.";
}
 
  //search by StudentId                                     //this array is record
    public String linearSearchbyStudentId(ArrayList<Student> array, String targetId){
        
         System.out.println("-----------");
         System.out.println("-- Searching by Student ID --");
        
        String NewtargetId = targetId.replace(" ", "");
        // Going one by one the elements in the array
        for(int i = 0; i < array.size(); i++){ //i is position
            System.out.println( "..." + array.get(i).getStudentId());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getStudentId().replace(" ", "").equalsIgnoreCase(NewtargetId )){
                return "The ID Found : " + targetId + array.get(i).showStudentinfo();//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The ID NOT found. Input correct? Try again.";
}
    
  //search by name                                     //this array is record
    public String linearSearchbyStudentname(ArrayList<Student> array, String targetName){
        
         System.out.println("-----------");
         System.out.println("-- Searching by Student Name --");
        
        String NewtargetName = targetName.replace(" ", "");
        // Going one by one the elements in the array
        for(int i = 0; i < array.size(); i++){ //i is position
            System.out.println( "..." + array.get(i).getStudentFullname());
            // When the element is found, stop the loop and return the index
            if(array.get(i).getStudentFullname().replace(" ", "").equalsIgnoreCase(NewtargetName )){
                return "The Name Found : "+ targetName + array.get(i).showStudentinfo();//show array=info of the book
                
            }            
        }//if the element is not found, show message. return position:-1 means the element doen't exist
        return "The Name NOT found. Spelling correct? Try again.";
}    
    
    
    
    
  
}



//    static int binarySearch(String[] arr, String x)
//    {
//        
//        int left = 0, 
//        right = arr.length - 1;
//        while (left <= right) {
//            int middle = left + (right - left) / 2;
// 
//            int res = x.compareTo(arr[middle]);
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
//    
//     String[] arr = { "contribute", "geeks", "ide", "practice"}; //declear array
//        String x = "geeks";//define target
//        int result = binarySearch(arr, x);
// 
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at "
//                              + "index " + result);
//}
