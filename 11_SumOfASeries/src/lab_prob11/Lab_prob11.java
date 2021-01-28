
package lab_prob11;

import java.util.Scanner;


public class Lab_prob11 {

    
    public static void main(String[] args) {
        double n, i;
        double sum=0;
        System.out.println("Enter a Number, n=?");
        Scanner in= new Scanner(System.in);
        n=in.nextDouble();
        System.out.println("n= "+ n);
        for(i=1; i<=n; i++){
            double c= 1/i;
            sum=sum+c;
        }
        
        System.out.println("1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n= "+sum);
    }
    
}
