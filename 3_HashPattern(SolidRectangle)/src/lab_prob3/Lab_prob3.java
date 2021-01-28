
package lab_prob3;

import java.util.Scanner;


public class Lab_prob3 {

    
    public static void main(String[] args) {
        while(true){
            System.out.println("Enter a number:");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            for(int i=1; i<=n; i++){           
                for(int j=1; j<=n; j++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            
        }
        
    }
    
}
