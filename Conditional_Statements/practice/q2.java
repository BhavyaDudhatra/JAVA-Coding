// Get the tamperature, if it is above 100 then it's fever.

import java.util.*;
public class q2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number : ");;
        int temp=sc.nextInt();
        if(temp>100){
            System.out.println("Fever");
        }
        else{
            System.out.println("Normal");
        }
    }
}