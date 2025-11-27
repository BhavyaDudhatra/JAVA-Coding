// count digit

public class p9{
    public static void main(String[] args) {
        int no=123456,len=0;
        while(no>0){
            no/=10;
            len++;
        }
        System.out.println("length is : " + len);
    }
}