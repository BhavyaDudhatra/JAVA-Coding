// number pyramid pattern

//     1
//    2 2 
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class q8{
    public static void main(String args[]){
        int no=5;
        for(int i=0;i<=no;i++){
            for(int j=0;j<=no-i;j++){
                System.out.print("   ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" "+ i +"   ");
            }
            System.out.println();
        }
    }
}