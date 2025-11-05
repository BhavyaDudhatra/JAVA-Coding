// Income Tax Calculator

public class p3 {
    public static void main(String args[]){
        float amount=430.30f;
        if(amount>1000){
            amount=amount+((amount*18)/100);
        }
        System.out.println("Payable amount is : " + amount);
    }
}
