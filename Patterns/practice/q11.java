// 1 4 9 16 25 
//   1 4 9  16 
//     1  4 9 
//        1 4  
//          1 

public class q11{
    public static void main(String[] args) {
        int no=5;
        for(int i=1;i<=no;i++){
            for(int k=1;k<=i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(no-i)+1;j++){
                System.out.print(j*j + " ");
            }
            System.out.println();
        }
    }
}