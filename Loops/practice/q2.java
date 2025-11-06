// get the number from user and print the factorial

import java.util.*;
public class q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=no;i++){
            factorial*=i;
        }
        System.out.println("Factorial of " + no + " : " + factorial);
    }
}