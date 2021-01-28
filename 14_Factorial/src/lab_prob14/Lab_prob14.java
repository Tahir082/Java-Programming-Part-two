/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob14;

import java.util.Scanner;


public class Lab_prob14 {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= in.nextInt();
        int res=1;
        int p;
        for(p=1; p<=n; p++){
            res=res*p;
        }
        System.out.println("Factorial of the given number= "+res);
    }
    
}
