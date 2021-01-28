

package lab_prob19;

import java.util.Scanner;


public class Lab_prob19 {

    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double x, n, rad_val;
        int i=1, j=3;
        double sum=0;
        System.out.println("Enter a Number, x=?");
        System.out.println("Enter range, n=?"); 
        x=in.nextDouble();
        n=in.nextDouble();
        System.out.println("x= "+ x);
        System.out.println("n= "+ n);
        rad_val=x*(3.1416/180);
        
        while(i<=n){
            double p= Math.pow(rad_val, i)/fact(i);
            sum=sum+p;
            i=i+4;
        }
        while(j<=n){
            double p= Math.pow(rad_val, j)/fact(j);
            sum=sum-p;
            j=j+4;
        }
        
        System.out.println("sin(x)= "+sum);
    }
    
    public static double fact(int n)
    {
        int res=1;
        int p;
        for(p=1; p<=n; p++)
        {
            res=res*p;
        }
        return res;
    }
    
}
