/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.Scanner;

/**
 *
 * @author emi
 */
public class InputUtilsLB {

    public String getUserText(String prompt) {//prompt = output

        Scanner myKB = new Scanner(System.in);
        boolean valid = false; //assume not valid
        String userInput;

        do {

            System.out.println(prompt);

            userInput = myKB.nextLine().trim(); // get input
            valid = true;

        } while (!valid); //keep going until valid input received

        return userInput;

    }

    /**
     * Prompt user to enter an integer - if invalid keep asking
     *
     * @param prompt the prompt or question to ask user
     * @return valid user input as an int
     *
     */
    public int getUserInt(String prompt) {

        Scanner myKB = new Scanner(System.in);
        int userInput = 0;
        boolean valid = false;

        do {
            System.out.println(prompt);

            try {

                userInput = myKB.nextInt(); //get a int
                valid = true;

            } catch (Exception e) {
                myKB.nextLine();
                System.out.println("Invalid -- you must enter an integer only!");
            }

        } while (!valid);

        return userInput;
    }

}
