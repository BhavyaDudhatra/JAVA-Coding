// Diamond Pattern

//     * 
//    * * 
//   * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

public class q9{
    public static void main(String args[]){
        int no=3;
        for(int i=0;i<=no;i++){
            for(int j=0;j<=(no-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=no-1;i>=0;i--){
            for(int j=0;j<=(no-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}