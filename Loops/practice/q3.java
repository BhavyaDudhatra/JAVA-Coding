// get a number from user and print the multiplication table of it

import java.util.*;
public class q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(no + " * " + i + " = " + no*i);
        }
    }
}