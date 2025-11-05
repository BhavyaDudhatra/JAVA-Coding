// check the number, is it prime or not

public class p13{
    public static void main(String args[]){
        int i=7;
        int check=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                check=1;
                break;
            }
        }
        if(check==1){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}