package lab_prob13;

import java.util.Scanner;


public class Lab_prob13 {

    
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
                
                while(k<=i){
                    int print;
                    print=(int)(fact(i)/(fact(k)* fact(i-k)));
                    System.out.print(print);
                    System.out.print(" ");
                    k++;
                    
                }             
                    
                
                c--;
                System.out.println("");
                i++;
                j=1;
                k=0;
            } 
    }
    public static double fact(int n){
        int res=1;
        int p;
        for(p=1; p<=n; p++){
            res=res*p;
        }
        return res;
    }
    
    
}
