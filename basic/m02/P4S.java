package basic.m02;

import java.util.Scanner;
public class P4S
{
    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Task 1");
      System.out.println("Enter name");
      String name;
      name=sc.nextLine();
      System.out.println("the name entered is"+name);
      
      System.out.println("Task 2");
      System.out.println("Enter your full name");
      String fname,mname,lname;
      fname=sc.next();
      mname=sc.next();
      lname=sc.next();
      System.out.println("the first name entered is"+fname);
      System.out.println("the first name entered is"+mname);
      System.out.println("the first name entered is"+lname);
      
      
      System.out.println("Task 3");
      int n1,n2;
      double a1,a2,a3,a4,a5;
      System.out.println("Enter num1");
      n1=sc.nextInt();
      System.out.println("Enter num2");
      n2=sc.nextInt();
      a1=n1+n2;
      a2=n1-n2;
      a3=n1*n2;
      a4=n1/n2;
      a5=n1%n2;
      System.out.println("The sum,difference,product,quotient and remainder of of "+n1+" and"+n2+" is=");
      System.out.println(a1+","+a2+","+a3+","+a4+","+a5+"respectively");
      
      System.out.println("Task 4");
      double r,ar;
      System.out.println("Enter radius");
      r=sc.nextDouble();
      
      ar=Math.PI*r*r;
      System.out.println("the area of circle is"+ar);
      
      System.out.println("Task 5");
      String namee,sect;
      int cl,marks,age,ph;
      System.out.println("Enter name");
      namee=sc.nextLine();
      System.out.println("Enter class");
      cl=sc.nextInt();
      System.out.println("Enter section");
      sect=sc.next();
      System.out.println("Enter marks");
      marks=sc.nextInt();
      System.out.println("Enter phone number");
      ph=sc.nextInt();
      System.out.println("Enter age");
      age=sc.nextInt();
      System.out.println("The name,age,class,section,marks and phone number is"+namee+","+age+","+cl+","+sect+","+marks+","+ph);
      
      
      
      
      
    }
}
