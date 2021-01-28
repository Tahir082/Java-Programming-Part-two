
package lab_prob10_ii;

import java.util.Scanner;


public class Lab_prob10_ii {

    
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
    }
    
}
