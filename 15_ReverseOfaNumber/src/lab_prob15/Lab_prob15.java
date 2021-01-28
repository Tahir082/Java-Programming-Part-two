
package lab_prob15;

import java.util.Scanner;


public class Lab_prob15 {

    
    public static void main(String[] args) {
        int rev=0, n, c=0;
        
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        n= in.nextInt();
        do{
            c= n%10;
            rev=rev*10+c;
            n=n/10;
            
        }
        while(n!=0);
        System.out.println("Reversed: "+rev);
    }
    
    
    
}
