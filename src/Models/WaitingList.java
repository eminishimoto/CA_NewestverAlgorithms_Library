/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


public class WaitingList implements Queue {

    // attribute
    private String[] data;
    private int queueSize;//number of element in my que
    private int capacity;
    private int front;//index of the front element
    private int back; //index of the back element

    //constructor
//    public WaitingList() {
//        this.capacity = capacity;
//        this.data = new String[capacity];
//        this.queueSize = 0;
//        this.front = -1;
//        this.back = -1;
//    }

    public WaitingList() {
        this.capacity = this.capacity; //limits?
        this.data = new String[capacity];
        this.queueSize = 0;
        this.front = -1;
        this.back = -1;
    }

    @Override
    public boolean Enqueue(String newElement) {
        if (queueSize >= capacity) {//impossible condition
            return false;

        }
        if (front == -1) {//( same as queueSize = 0) 
            front++;
        }

        back++; //move pointer //back move as well like first
        data[back] = newElement; //store data as new element
        queueSize++; //size increse as well
        return true  ;

    }
    
   


    @Override
    public String Dequeue() {
        if (queueSize == 0) {
            return null;
        }

        //save the front value 
        String toReturn = data[front]; //set front data as roReturn
        data[front] = null; // delate element 
        front++;
        queueSize--;  //
        return toReturn;
    }

    @Override
    public String First() {
        if (queueSize == 0) { //quesize0
            return null;//can borrow the book
        }

        return data[front];//the first element of the data
    }

    @Override
    public String Last() {
        if (queueSize == 0) {
            return null;
        }
        return data[back];
    }

    @Override
    public int size() {
        return queueSize;
    }

    @Override
    public boolean isEmpty() {//true or false = boolen
        if (queueSize == 0) {
            return true;//can borrow the book
        }
        return false;
    }

    public String[] showdata(){
    return this.data;
}
    
    @Override
    public String toString() {
        String toReturn = "["; //to represent an array
        //for loop to go through the array
        for (int i = front; i <= back; i++) { //start from pointer not from 0, till the back
            toReturn += data[i] + ",";  //adding data and , to toReturn
        }
        toReturn += "]";

        return toReturn;
    }

}
