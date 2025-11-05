// print reverse of a number

public class p7{
    public static void main(String args[]){
        int no=12345;
        for(int i=0;i<5;i++){
            System.out.print(no%10);
            no/=10;
        }
    }
}