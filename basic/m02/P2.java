package basic.m02;

import java.io.*;
public class P2
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Task 1:");
        int s=5,a;
        a=s*s;
        System.out.println("Area of the square of side"+s+"is"+a);
        System.out.println("Task 2:");
        int l=5,b=2,a1;
        a1=l*b;
        System.out.println("Area of the rectangle of legnth and bredth"+l+","+b+"is"+a1);
        System.out.println("Task 3:");
        double r=5;
        double a2;
        a2=Math.PI*r*r;
        System.out.println("Area of the circle of radius"+r+"is"+a2);
        System.out.println("Task 4:");
        double o=8,h=2,a3;
        a3=0.5*o*h;
        System.out.println("Area of the triangle with base and height"+o+","+h+"is"+a3);
        System.out.println("Task 5:");
        double p=3,q=4,u=5,a4,e;
        e=(p+q+r)/2;
        a4=Math.sqrt(e*(e-p)*(e-q)*(e-r));
        System.out.println("Area of the triangle with sides"+p+","+q+","+u+"is"+a4);
        System.out.println("Task 6:");
        double r2=5;
        double a5,a6;
        a5=4*Math.PI*r*r;
        a6=(4/3)*Math.PI*r*r*r;
        System.out.println("Area and volume of a sphere of radius"+r2+"is"+a5+"and"+a6);
        System.out.println("Task 7:");
        double far=191;
        double cel;
        cel=(5*(far-32))/9;
        System.out.println("the celsius equivalent of "+far+"F is "+cel+"C");
        System.out.println("Task 8:");
        double ce=5;
        double fa;
        fa=((9/5)*ce)+32;
        System.out.println("the faranheit equivalent of "+ce+"C is "+fa+"F");
        System.out.println("Task 9:");
        double pri=3000,rate=5,time=4,compint;
        compint=(pri*(Math.pow(1+(rate/100),time))-1);
        System.out.println("compound interest with principle,rate,time"+pri+","+rate+","+time+"is"+compint);
        System.out.println("Task 10:");
        int n1=10,n2=30,temp;
        System.out.println("Originaly "+n1+" and "+n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Now"+n1+" and "+n2);
        
        
        
        
        
        
        
    }
}
    