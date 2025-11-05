// Get number form user and check whether it is Positive or Negative

import java.util.*;
public class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int no=sc.nextInt();

        if(no>0){
            System.out.println("it's Positive");
        }
        else if(no<0){
            System.out.println("it's Negative");
        }
        else{
            System.out.println("it's Zero");
        }
    }
}