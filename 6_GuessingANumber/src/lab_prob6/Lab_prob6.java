
package lab_prob6;

import java.util.Scanner;


public class Lab_prob6 {

    
    public static void main(String[] args) {
        while(true){
            Scanner in= new Scanner(System.in);
            System.out.println("Type in a number between 1 to 100");
            int m= in.nextInt();
            System.out.println("The program has produced a Random Number");
            double a=3, c=145;
            System.out.println("Now guess the Random number and Type in:");
            int n= in.nextInt();
            double p = m*a+c;
            if(n>p){
            System.out.println("Guessed number is TOO HIGH, Try Again!");
            }
            else
            {
            System.out.println("Guessed number is TOO LOW, Try Again");
            }
        }
        
    }
    
}
