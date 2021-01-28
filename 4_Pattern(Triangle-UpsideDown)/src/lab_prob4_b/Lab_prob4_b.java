
package lab_prob4_b;

import java.util.Scanner;


public class Lab_prob4_b {

    
    public static void main(String[] args) {
        while(true){
            int i, j , k, c;
            System.out.println("Enter a number:");
            Scanner in= new Scanner(System.in);
            int n= in.nextInt();
            c=n;
            for(i=n; i>=1; i--){
                for(j=1; j<=c-1; j++){
                    System.out.print(" ");
                }
                for(k=1; k<=2*i-1; k++){
                    System.out.print("#");
                }
                c++;
                System.out.println("");
            }
            
        }
    }
    
}
