// get N numbers form user and print the sum of Odd and Even.

import java.util.*;
public class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many number you want to enter? : ");
        int qty=sc.nextInt();
        int no,even=0,odd=0;

        for(int i=0;i<qty;i++){
            System.out.print("Enter any number : ");
            no=sc.nextInt();
            if(no%2==0){
                even+=no;
            }
            else{
                odd+=no;
            }
        }
        System.out.println("Sum of Odd : " + odd);
        System.out.println("Sum of Even : " + even);
    }
}