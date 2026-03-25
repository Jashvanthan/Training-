import java.util.*;
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("The sum of two numbers is:"+add(a,b));
        System.out.println("Enter the first number:");
        double c=sc.nextDouble();
        System.out.println("Enter the second number:");
        double d=sc.nextDouble();
        System.out.println("The sum of two numbers is:"+add(c,d));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
}