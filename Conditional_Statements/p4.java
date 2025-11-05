// Print the largest of three

public class p4 {
    public static void main(String args[])
    {
        int a=31,b=12,c=3;
    if(a>b){
        if(a>c){
            System.out.println("A is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
    else if(b>c){
        System.out.println("B is largest");
    }
    else{
        System.out.println("C is largest");
    }
    }
}