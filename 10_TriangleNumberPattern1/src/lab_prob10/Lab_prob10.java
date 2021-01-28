
package lab_prob10;

import java.util.Scanner;


public class Lab_prob10 {

    
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
                while(k<=2*i-1){
                    System.out.print(i);
                    k++;
                }
                c--;
                System.out.println("");
                i++;
                j=1;
                k=1;
            }
    }
    
}
