
package lab_prob8;

import java.util.Scanner;


public class Lab_prob8 {

    
    public static void main(String[] args) {
        while(true){
            System.out.println("Type in a number");
            Scanner in= new Scanner(System.in);
            int a= in.nextInt();
            int num, temp, reverse=0;
            num=a;
            while(num!=0){
                temp=num%10;
                reverse=reverse*10+temp;
                num=num/10;
            }
            if(a==reverse){
                System.out.println("The number is a Palindrome number.");
            
            }
            else{
                System.out.println("The number is NOT a Palindrome number.");
            }
            
        }
        
    }
    
}
