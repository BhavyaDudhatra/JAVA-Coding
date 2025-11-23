// Number pattern

// 12345
// 2345
// 345
// 45
// 5

public class p6{
    public static void main(String[] args) {
        int no=5;
        for(int i=1;i<=no;i++){
            for(int j=i;j<=no;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}