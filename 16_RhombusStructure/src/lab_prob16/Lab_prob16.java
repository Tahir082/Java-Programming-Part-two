/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_prob16;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab_prob16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1, j=1, k=1, n, c;
        
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        n= in.nextInt();
        c=n;
        while(i<=n){
                while(j<=c-1){
                    System.out.print(" ");
                    j++;
                }
                int p=i, t=1;
                while(k<=i && p>=1){
                    System.out.print(p);
                    p--;
                }             
                while(k<=i && t<=i){
                    if(t>1)
                    {
                        System.out.print(t);
                    }
                    
                    t++;     
                }
                c--;
                System.out.println("");
                i++;
                j=1;
                k=1;
            }
        c=0;
        for(int a=n-1; a>=1; a--){
                for(j=0; j<=c; j++){
                    System.out.print(" ");
                }
                int p=a, t=1;
                while(k<=a && p>=1){
                    System.out.print(p);
                    p--;
                }             
                while(k<=a && t<=a){
                    if(t>1)
                    {
                        System.out.print(t);
                    }
                    
                    t++;     
                }
                c++;
                System.out.println("");
                j=1;
                k=1;
            }
    }
    
}
