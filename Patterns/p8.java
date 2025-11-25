// Armstrong Number
import java.math.*;
public class p8{
    public static void main(String[] args) {
        int no=153,temp=no;
        double sum=0;
        while(no>0){
            sum=sum+(Math.pow(no%10,3));
            no/=10;
        }
        if ((int)sum==temp) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}