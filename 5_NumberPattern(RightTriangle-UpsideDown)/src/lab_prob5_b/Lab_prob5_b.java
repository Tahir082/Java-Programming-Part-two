
package lab_prob5_b;

import java.util.Scanner;


public class Lab_prob5_b {

    
    public static void main(String[] args) {
        while(true){
            int i, j, k, c;
            System.out.println("Enter a number:");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            c=n;
            for(i=1; i<=n; i++){
                for(j=1; j<i; j++){
                    System.out.print(" ");
                }
                for(k=1; k<=c; k++){
                    System.out.print(k);
                }
                c--;
                
                
                System.out.println("");
            }
            
        }
    }
    
}
