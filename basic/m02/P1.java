package basic.m02;

import java.io.*;
public class P1
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Task 1:");
        System.out.println("Hello World");
        System.out.println("Task 2:");
        System.out.println("Keerthi Raghavendra");
        System.out.println("Task 3:");
        int a=3,b=4,c;
        c=a+b;
        System.out.println("The sum of "+a+" and"+b+" is="+c);
        System.out.println("Task 4:");
        int p=9,q=7,r;
        r=p+q;
        System.out.println("The difference bw "+p+" and"+q+" is="+r);
        System.out.println("Task 5:");
        int d=9,e=7,f;
        f=d*e;
        System.out.println("The product of "+d+" and"+e+" is="+f);
        System.out.println("Task 6:");
        int w=10,o=5,z;
        z=w/o;
        System.out.println("The quotient of "+w+" and"+o+" is="+z);
        System.out.println("Task 7:");
        int n=11,m=5,l;
        l=n%m;
        System.out.println("The quotient of "+n+" and"+m+" is="+l);
        System.out.println("Task 8:");
        int n1=56,n2=48,a1,a2,a3;
        float a4,a5;
        a1=n1+n2;
        a2=n1-n2;
        a3=n1*n2;
        a4=n1/n2;
        a5=n1%n2;
        System.out.println("The sum,difference,product,quotient and remainder of of "+n1+" and"+n2+" is=");
        System.out.println(a1+","+a2+","+a3+","+a4+","+a5+"respectively");
        System.out.println("Task 9:");
        int m1,m2,b1,b2,b3;
        float b4,b5;
        System.out.println("Enter number 1");
        m1=Integer.parseInt(in.readLine());
        System.out.println("Enter number 2");
        m2=Integer.parseInt(in.readLine());
        b1=m1+m2;
        b2=m1-m2;
        b3=m1*m2;
        b4=m1/m2;
        b5=m1%m2;
        System.out.println("The sum,difference,product,quotient and remainder of of "+m1+" and"+m2+" is=");
        System.out.println(b1+","+b2+","+b3+","+b4+","+b5+"respectively");
        
        
        
    }
}
