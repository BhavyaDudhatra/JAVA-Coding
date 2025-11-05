// print sum of 1 to N

import java.util.*;
public class p5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int no=sc.nextInt();
        int sum=0;
        for(int i=0;i<=no;i++){
            sum+=i;
        }
        System.out.println("Sum is : " + sum);
    }
}