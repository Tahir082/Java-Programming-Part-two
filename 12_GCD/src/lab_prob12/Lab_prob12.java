
package lab_prob12;

import java.util.Scanner;


public class Lab_prob12 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Type in 1st Number: ");
        int a= input.nextInt();
        System.out.println("Type in 2nd Number: ");
        int b= input.nextInt();
        double gcd= gcd(a,b);
        System.out.println("The GCD of the following two numbers is:" + gcd);
        
    }
    
    public static float gcd(int a, int b){
        float gcd = 0;
        for(int i = 1; i <= a && i <= b; ++i){
            
            if(a % i==0 && b % i==0)
                gcd = i;
        }
        return gcd;
    }
    
}
