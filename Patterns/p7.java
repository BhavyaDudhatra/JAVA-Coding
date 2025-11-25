// sum of factorial

public class p7{
    public static void main(String[] args) {
        int sum=0,factorial=1,no=5;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                factorial=factorial*j;
            }
            sum+=factorial;
        }
        System.out.println(sum);
    }
}