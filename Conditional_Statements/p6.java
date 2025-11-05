// Check if a student will Pass or Fail

public class p6 {
    public static void main(String args[]){
        int m1=23,m2=4,m3=45;
        float avg;
        avg=(m1+m2+m3)/3;
        System.out.println(avg + "is avg.");
        if(avg>33.33){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
