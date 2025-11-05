// reverse the given number

public class p8{
    public static void main(String args[]){
        int no=15971;
        int rev=0;
        for(int i=0;i<5;i++){
            rev=rev*10+(no%10);
            // rev=rev+(no%10);
            no/=10;
        }
        System.out.println("no : " + no);
        System.out.print("rev : " + rev);
    }
}