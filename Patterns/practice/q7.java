// Solid Rhombus pattern

//      * * * * *
//     *       *
//    *       *
//   *       * 
//  *       *
// * * * * *

public class q7{
    public static void main(String args[]){
        int no=5;
        for(int i=0;i<=no;i++){
            for(int j=0;j<=no-i;j++){
                System.out.print("   ");
            }
            for(int k=0;k<=no;k++){
                if(i==0 || i==no || k==0 || k==no){
                    System.out.print( " * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}