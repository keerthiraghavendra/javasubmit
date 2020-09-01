package basic.m02;

import java.io.*;
public class P3
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("Task 1:");
        int s;
        System.out.println("enter dimensions of square");
        s=Integer.parseInt(br.readLine());
        int a;
        a=s*s;
        System.out.println("Area of the square of side"+s+"is"+a);
        System.out.println("Task 2:");
        System.out.println("enter dimensions of rectangle");
        int l,b,a1;
        l=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        a1=l*b;
        System.out.println("Area of the rectangle of legnth and bredth"+l+","+b+"is"+a1);
        System.out.println("Task 3:");
        double r;
        double a2;
        System.out.println("enter dimensions of circle");
        r=Double.parseDouble(br.readLine());
        a2=Math.PI*r*r;
        System.out.println("Area of the circle of radius"+r+"is"+a2);
        System.out.println("Task 4:");
        double o,h,a3;
        System.out.println("enter dimensions of triangle height and base");
        o=Double.parseDouble(br.readLine());
        h=Double.parseDouble(br.readLine());
        a3=0.5*o*h;
        System.out.println("Area of the triangle with base and height"+o+","+h+"is"+a3);
        System.out.println("Task 5:");
        double p,q,u,a4,e;
        System.out.println("enter dimensions of triangle all sides");
        p=Double.parseDouble(br.readLine());
        q=Double.parseDouble(br.readLine());
        u=Double.parseDouble(br.readLine());
        e=(p+q+u)/2;
        a4=Math.sqrt(e*(e-p)*(e-q)*(e-u));
        System.out.println("Area of the triangle with sides"+p+","+q+","+u+"is"+a4);
        System.out.println("Task 6:");
        double r2;
        double a5,a6;
        System.out.println("enter dimensions of sphere");
        r2=Double.parseDouble(br.readLine());
        a5=4*Math.PI*r*r;
        a6=(4/3)*Math.PI*r*r*r;
        System.out.println("Area and volume of a sphere of radius"+r2+"is"+a5+"and"+a6);
        System.out.println("Task 7:");
        double far;
        double cel;
        System.out.println("enter faranheit");
        far=Double.parseDouble(br.readLine());
        cel=(5*(far-32))/9;
        System.out.println("the celsius equivalent of "+far+"F is "+cel+"C");
        System.out.println("Task 8:");
        double ce;
        double fa;
        System.out.println("enter celcius");
        ce=Double.parseDouble(br.readLine());
        fa=((9/5)*ce)+32;
        System.out.println("the faranheit equivalent of "+ce+"C is "+fa+"F");
        System.out.println("Task 9:");
        double prin,ratee,timee,simpint;
        System.out.println("enter principle");
        prin=Double.parseDouble(br.readLine());
        System.out.println("enter rate");
        ratee=Double.parseDouble(br.readLine());
        System.out.println("enter time");
        timee=Double.parseDouble(br.readLine());
        simpint=(prin*ratee*timee)/100;
        System.out.println("simple interest with principle,rate,time"+prin+","+ratee+","+timee+"is"+simpint);
        System.out.println("Task 10:");
        double pri,rate,time,compint;
        System.out.println("enter principle");
        pri=Double.parseDouble(br.readLine());
        System.out.println("enter rate");
        rate=Double.parseDouble(br.readLine());
        System.out.println("enter time");
        time=Double.parseDouble(br.readLine());
        compint=(pri*(Math.pow(1+(rate/100),time))-1);
        System.out.println("compound interest with principle,rate,time"+pri+","+rate+","+time+"is"+compint);
        System.out.println("Task 11:");
        double deg,rad;
        System.out.println("enter degree");
        deg=Double.parseDouble(br.readLine());
        rad=Math.toRadians(deg);
        System.out.println("In radians that would be"+rad);
        System.out.println("Task 12:");
        double degg,radd;
        System.out.println("enter radian");
        radd=Double.parseDouble(br.readLine());
        degg=Math.toDegrees(radd);
        System.out.println("In degrees that would be"+degg);
        System.out.println("Task 13:");
        double nn,rep;
        System.out.println("enter n for repunit");
        nn=Integer.parseInt(br.readLine());
        rep=((Math.pow(10,nn))-1)/9;
        System.out.println("The repunit is"+rep);
        System.out.println("Task 14:");
        double mn,mer;
        System.out.println("enter n for mersenne number");
        mn=Integer.parseInt(br.readLine());
        mer=(Math.pow(2,mn))-1;
        System.out.println("The mersenne number is"+mer);
        System.out.println("Task 15:");
        int n1,n2,temp;
        System.out.println("enter 2 numbers to be swapped");
        n1=Integer.parseInt(br.readLine());
        n2=Integer.parseInt(br.readLine());
        System.out.println("Originaly "+n1+" and "+n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Now"+n1+" and "+n2);
        System.out.println("Task 16:");
        double ca,cb,cc,x1,x2;
        System.out.println("enter co-efficients of x^2,x and the constant");
        ca=Double.parseDouble(br.readLine());
        cb=Double.parseDouble(br.readLine());
        cc=Double.parseDouble(br.readLine());
        x1=(-cb+(Math.sqrt(cb*cb-(4*ca*cc)))/2*ca);
        x2=(-cb-(Math.sqrt(cb*cb-(4*ca*cc)))/2*ca);
        System.out.println("The roots are"+x1+" and "+x2);
        
        
        
        
        
        
        
    }
}