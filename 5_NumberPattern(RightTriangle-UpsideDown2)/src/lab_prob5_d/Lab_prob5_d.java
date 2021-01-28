
package lab_prob5_d;

import java.util.Scanner;


public class Lab_prob5_d {

   
    public static void main(String[] args) {
        while(true){
            int i, j, k, c;
            System.out.println("Enter a number:");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            c=n;
            for(i=n; i>=1; i--){
                for(k=i; k>=1; k--){
                    System.out.print(k);
                }
                
                
                
                System.out.println("");
            }
            
        }
      
    }
    
}
