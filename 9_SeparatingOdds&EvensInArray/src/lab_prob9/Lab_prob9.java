
package lab_prob9;

import java.util.Scanner;


public class Lab_prob9 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int i, j=0, temp;
        Scanner in= new Scanner(System.in);
        System.out.println("How Many numbers you want to input?");
        int n = in.nextInt();
        int nums[] = new int[n];
        System.out.println("Type in " +n+ " numbers");
        for(i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        for(i=0; i<n; i++){
            if(nums[i]%2==0){ 
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        System.out.println("Array after separation of even and odd numbers");
        for(int elem: nums){
            System.out.print(elem);
            System.out.print(", ");
        }
    }
    
}
