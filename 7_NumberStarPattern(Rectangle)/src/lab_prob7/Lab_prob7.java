
package lab_prob7;

import java.util.Scanner;


public class Lab_prob7 {

   
    public static void main(String[] args) {
         while(true){
            int i, j , k;
            System.out.println("Enter a number:");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            for(i=1; i<=n; i++){
                for(j=1; j<=i; j++){
                    System.out.print(j);
                }
                for(k=j; k<=n; k++){
                    System.out.print("*");
                }
                
                
                System.out.println("");
            }
            
        }
    }
    
}
