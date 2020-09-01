package basic.m02;

import java.io.*;
public class P4B
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("Task 1");
        System.out.println("Enter your name");
        String s;
        s=br.readLine();
        System.out.println("name is"+s);
        
        
        System.out.println("Task 2:");
        int m1,m2,b1,b2,b3;
        float b4,b5;
        System.out.println("Enter number 1");
        m1=Integer.parseInt(br.readLine());
        System.out.println("Enter number 2");
        m2=Integer.parseInt(br.readLine());
        b1=m1+m2;
        b2=m1-m2;
        b3=m1*m2;
        b4=m1/m2;
        b5=m1%m2;
        System.out.println("The sum,difference,product,quotient and remainder of of "+m1+" and"+m2+" is=");
        System.out.println(b1+","+b2+","+b3+","+b4+","+b5+"respectively");
        
        System.out.println("Task 3:");
        System.out.println("enter dimensions of rectangle");
        int l,b,a1;
        l=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        a1=l*b;
        System.out.println("Area of the rectangle of legnth and bredth"+l+","+b+"is"+a1);
        
        System.out.println("Task 4:");
        double p,q,u,a4,e;
        System.out.println("enter dimensions of triangle all sides");
        p=Double.parseDouble(br.readLine());
        q=Double.parseDouble(br.readLine());
        u=Double.parseDouble(br.readLine());
        e=(p+q+u)/2;
        a4=Math.sqrt(e*(e-p)*(e-q)*(e-u));
        System.out.println("Area of the triangle with sides"+p+","+q+","+u+"is"+a4);
        
        System.out.println("Task 4:");
        String name;
        char sect;
        int cl,marks,age,ph;
        System.out.println("Enter name");
        name=br.readLine();
        System.out.println("Enter class");
        cl=Integer.parseInt(br.readLine());
        System.out.println("Enter section");
        sect=(char)(br.read());
        System.out.println("Enter marks");
        marks=Integer.parseInt(br.readLine());
        System.out.println("Enter age");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter phone number");
        ph=Integer.parseInt(br.readLine());
        System.out.println("The name,age,class,section,marks and phone number is"+name+","+age+","+cl+","+sect+","+marks+","+ph);
        
        
        
        
        
        
        
    }
}
