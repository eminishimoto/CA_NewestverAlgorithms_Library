/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoroller;

import Models.Book;

/**
 *
 * @author emi
 */
public class BubbleSort {
    
    public Book[] bubbleSort(Book[] array) {
       
        //code goes here
        Book temp;
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].getBook_title().compareTo(array[j+1].getBook_title()) > 0) {//後ろのpositionと比べ大きいなら
                    //    swap element
                    //create temporary 
                    temp = array[j];//save the value of temp into array[j+1]
                    array[j] = array[j + 1];//change the value of array[j] for array
                    array[j + 1] = temp;//save the value of temp into array[j+1]
                }

            }
        }
        return array;
    }
    
}
