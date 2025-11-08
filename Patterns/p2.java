// pattern 

// *****
// ****
// ***
// **
// *

import java.util.*;
public class p2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int no=sc.nextInt();
        for(int i=no;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}