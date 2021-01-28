
package lab_prob5_a;

import java.util.Scanner;


public class Lab_prob5_a {

    
    public static void main(String[] args) {
        while(true){
            int i, j;
            System.out.println("Enter a number:");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            for(i=1; i<=n; i++){
                for(j=1; j<=i; j++){
                    System.out.print(j);
                }
                
                
                System.out.println("");
            }
            
        }
    }
    
}
