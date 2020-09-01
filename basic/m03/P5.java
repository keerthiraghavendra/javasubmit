package basic.m03;
import java.util.Scanner;
public class P5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a=4,b=5,c,n,n1,n2,n3,d;
        String m;
        c=(a>b?a:b);
        System.out.println(c);
        System.out.println("enter a number");
        n=sc.nextInt();
        m=(n%2==0?"even":"odd");
        System.out.println(m);
        System.out.println("enter 3 numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        d=((n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3)?n2:n3);
        System.out.println(d);
        
        
        
        
        
    }
}