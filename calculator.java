import java.util.*;

public class Calculator {
    public static void getSum(int a,int b){
        System.out.println(a+b);
    }
    public static void getSubtract(int a,int b){
        System.out.println(Math.abs(a-b));
    }
    public static void getMulti(int a,int b){
        System.out.println(a*b);
    }

    public static void getDiv(int a,int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
       Scanner ip=new Scanner(System.in);
       System.out.println("Enter 1st Num: ");
       int x=ip.nextInt();

       System.out.println("Enter 2nd Num: ");
       int y=ip.nextInt();
    }
}
