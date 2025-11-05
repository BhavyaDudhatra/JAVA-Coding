// Calculator

public class p8 {
    public static void main(String args[]){
        int n1=25,n2=4;
        float ans;
        char op='%';
        switch(op){
            case '/':
                ans=n1/n2;
                System.out.println(n1 + " / " + n2 + " = " + ans);
                break;
            case '*':
                ans=n1*n2;
                System.out.println(n1 + " * " + n2 + " = " + ans);
                break;
            case '+':
                ans=n1+n2;
                System.out.println(n1 + " + " + n2 + " = " + ans);
                break;
            case '-':
                ans=n1-n2;
                System.out.println(n1 + " - " + n2 + " = " + ans);
                break;
            case '%':
                ans=n1%n2;
                System.out.println(n1 + " % " + n2 + " = " + ans);
                break;
            default:
                System.out.println("Invalid...");
        }
    }
}