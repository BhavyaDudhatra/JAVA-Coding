// Arithmatic Operator
// Unary Operator
// Relational Operator
// Logical Operator
// Assignment Operator
// Turnary Operator

public class operators{
    public static void main(String args[]){
        int a=6,b=2,c=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);

        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(b);
        b--;
        System.out.println(b);

        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        // &&
        // ||
        // !

        c+=a;
        System.out.println(c);
        c-=a;
        System.out.println(c);
        c*=a;
        System.out.println(c);
        c/=a;
        System.out.println(c);

        String s= (a>=b)?"true":"false";
        c= (a==b)?1:0;

        System.out.println(s);
        System.out.println(c);

    }
}