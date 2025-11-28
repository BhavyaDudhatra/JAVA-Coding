// sum of digits of a number shoulld be palindrome

public class q4{
    public static void main(String[] args) {
        int no=994,temp=no,sum=0,rev=0;
        while(no>0){
            sum=sum+(no%10);
            no/=10;
        }
        no=temp;
        while(sum>0){
            rev=(rev*10)+(sum%10);
            sum/=10;
        }
        System.out.println(sum);
        System.out.println(rev);
        if(rev==sum){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}