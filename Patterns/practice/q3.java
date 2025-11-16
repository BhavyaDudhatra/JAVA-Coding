// Inverted Half-Pyramid pattern eith number pattern

// 12345
// 1234
// 123
// 12
// 1

public class q3{
    public static void main(String args[]){
        int no=5;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=1+(no-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}