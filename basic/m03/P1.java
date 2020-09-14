package basic.m03;

import java.util.Scanner;
public class P1
{
    public static void main()
    {
        
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,num4,num5;
        int num6,num7,num8,num9,num10;
        
        System.out.println("Task 1");
        System.out.println("Enter two numbers to find smallest and largest");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if (num1<num2)
        {
            System.out.println(num2+"is larger");
        }
        if (num1>num2)
        {
            System.out.println(num1+"is larger");
        }
        System.out.println("Task 2");
        if (num1<num2)
        {
            System.out.println(num1+"is smaller");
        }
        if (num1>num2)
        {
            System.out.println(num2+"is smaller");
        }
        System.out.println("Task 3");
        System.out.println("ener number to check even or odd");
        num3=sc.nextInt();
        if (num3%2==0)
        {
            System.out.println(num3+" is even");
        }
        if (num3%2!=0)
        {
            System.out.println(num3+"is odd");
        }
        System.out.println("Task 4");
        System.out.println("ener number to check divisibility by 7");
        num4=sc.nextInt();
        if (num4%7==0)
        {
            System.out.println(num4+" is divisible");
        }
        if (num4%7!=0)
        {
            System.out.println(num4+"is not divisible");
        }
        System.out.println("Task 5");
        System.out.println("ener number to check positive or negative");
        num5=sc.nextInt();
        if (num5<0)
        {
            System.out.println(num5+"negative");
        }
        if (num5>0)
        {
            System.out.println(num5+"positive");
        }
        System.out.println("Task 6");
        System.out.println("Enter two numbers to find smallest and largest");
        num6=sc.nextInt();
        num7=sc.nextInt();
        if (num6<num7)
        {
            System.out.println(num7+"is larger");
        }
        else
        {
            System.out.println(num6+"is larger");
        }
        System.out.println("Task 7");
        if (num6<num7)
        {
            System.out.println(num6+"is smaller");
        }
        else
        {
            System.out.println(num7+"is smaller");
        }
        System.out.println("Task 8");
        System.out.println("ener number to check even or odd");
        num8=sc.nextInt();
        if (num8%2==0)
        {
            System.out.println(num8+" is even");
        }
        else
        {
            System.out.println(num8+"is odd");
        }
        System.out.println("Task 9");
        System.out.println("ener number to check divisibility by 7");
        num9=sc.nextInt();
        if (num4%7==0)
        {
            System.out.println(num9+" is divisible");
        }
        else
        {
            System.out.println(num9+"is not divisible");
        }
        System.out.println("Task 10");
        System.out.println("ener number to check positive or negative");
        num10=sc.nextInt();
        if (num10<0)
        {
            System.out.println(num10+"negative");
        }
        else
        {
            System.out.println(num10+"positive");
        }
    }
}