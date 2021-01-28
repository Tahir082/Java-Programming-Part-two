/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob18;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab_prob18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int year= in.nextInt();
        if (year%4== 0) {
            System.out.println(year+" is a leap year.");
        }
        else if (year%400== 0) {
            System.out.println(year+" is a leap year.");
        }
   
        else if (year%100== 0) {
            System.out.println(year+"%d is not a leap year.");
        }
        
        else {
            System.out.println(year+ " is not a leap year.");
        }
    }
    
}
