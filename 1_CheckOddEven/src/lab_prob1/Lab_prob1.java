
package lab_prob1;

import java.util.Scanner;


public class Lab_prob1 {

    
    public static void main(String[] args) {
        
        while(true){
            System.out.println("Type in a number:");
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        if(a%2==0){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }
        
        System.out.println("BYE!");
            
        }
        
        
    }
    
}
