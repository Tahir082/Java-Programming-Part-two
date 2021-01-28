
package lab_prob2;

public class Lab_prob2 {

    
    public static void main(String[] args) {
       double i, next, n1, n2, sum=0;
       double avg;
       n1=1;
       n2=1;
        System.out.println("Fibonacci Series:");
        for(i=1; i<=20; i++){
            System.out.print(" "+n1);
            sum=sum+n1;
            next=n1+n2;
            n1=n2;
            n2=next;
        }
        avg= sum/20;
        System.out.println("");
        System.out.println("The average of first 20 term of fibonacci series: "+avg);
    }
    
}
