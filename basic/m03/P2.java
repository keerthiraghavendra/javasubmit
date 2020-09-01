package basic.m03;

import java.util.Scanner;
public class P2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("enter 3 numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        System.out.println("Task 1");
        if (num1 > num2 && num1 > num3)
        {
           System.out.println("Largest is"+num1); 
        }
        else if (num2 > num1 && num2 > num3)
        {
           System.out.println("Largest is"+num2); 
        }
        else if (num3 > num2 && num3 > num2)
        {
           System.out.println("Largest is"+num3); 
        }
        
        System.out.println("Task 2");
        if (num1 < num2 && num1 < num3)
        {
           System.out.println("Smallest is"+num1); 
        }
        else if (num2 < num1 && num2 < num3)
        {
           System.out.println("Smallest is"+num2); 
        }
        else if (num3 < num2 && num3 < num2)
        {
           System.out.println("Smallest is"+num3); 
        }
        System.out.println("Task 3");
        System.out.println("Enter a,b,c of a quadratic");
        int a,b,c;
        double d,x1,x2;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*b-4*a*c;
        if (d>0 || d==0)
        {
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b-Math.sqrt(d))/2*a;
            System.out.println("the two roots are"+x1+"and"+x2);
        }
        else if (d<0)
        {
          System.out.println("root does not exist");  
        }
        
            
        System.out.println("Task 4");
        int m;
        System.out.println("enter marks ");
        m=sc.nextInt();
        if(m>=80)
        {
            System.out.println("Grade A");
        }
        
        else if(m>60 && m<80)
        {
            System.out.println("Grade B");
        }
        else if(m>50 && m<60)
        {
            System.out.println("Grade C");
        }
        else if(m>40 && m<50)
        {
            System.out.println("Grade D");
        }
        else if(m<40)
        {
            System.out.println("Grade E");
        }
        
        System.out.println("Task 5");
        int n;
        System.out.println("enter number of day ");
        n=sc.nextInt();
        if(n==1)
        {
            System.out.println("Monday");
        }
        else if(n==2)
        {
            System.out.println("Tuesday");
        }
        else if(n==3)
        {
            System.out.println("Wednesday");
        }
        else if(n==4)
        {
            System.out.println("Thursday");
        }
        else if(n==5)
        {
            System.out.println("Friday");
        }
        else if(n==6)
        {
            System.out.println("Saturday");
        }
        else if(n==6)
        {
            System.out.println("Sunday");
        }
        System.out.println("Task 6");
        int v;
        System.out.println("enter number of month ");
        v=sc.nextInt();
        if(v==1)
        {
            System.out.println("Jan");
        }
        else if(v==2)
        {
            System.out.println("Feb");
        }
        else if(v==3)
        {
            System.out.println("Mar");
        }
        else if(v==4)
        {
            System.out.println("Apr");
        }
        else if(v==5)
        {
            System.out.println("May");
        }
        else if(v==6)
        {
            System.out.println("Jun");
        }
        else if(v==7)
        {
            System.out.println("Jul");
        }
        else if(v==8)
        {
            System.out.println("Aug");
        }
        else if(v==9)
        {
            System.out.println("Sep");
        }
        else if(v==10)
        {
            System.out.println("Oct");
        }
        else if(v==12)
        {
            System.out.println("Nov");
        }
        else if(v==12)
        {
            System.out.println("Dec");
        }
        
        System.out.println("Task 8");
        char ch;
        System.out.println("enter a char");
        ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch))
        {
            System.out.println(ch+"is a uppercase");
            
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println(ch+"is a LowerCase");
            
        }
        else if(Character.isDigit(ch))
        {
            System.out.println(ch+"is a Digit");
            
        }
        else
        {
            System.out.println(ch+"is a Spl character");
        }
        
        System.out.println("Task 7");
        int k;
        k=(int)ch;
        if(k>64 && k<91)
        {
            System.out.println(ch+"is a uppercase");
            
        }
        else if(k>96 && k<123)
        {
            System.out.println(ch+"is a LowerCase");
            
        }
        else if(k>47 && k<58)
        {
            System.out.println(ch+"is a Digit");
            
        }
        else
        {
            System.out.println(ch+"is a Spl character");
        }
        
        System.out.println("Task 9");
        char i;
        System.out.println("enter a char");
        i=sc.next().charAt(0);
        if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u')
        {
            System.out.println(ch+"is a vowel");
            
        }
        else
        {
            System.out.println(ch+"is not a vowel");
            
        }
        System.out.println("Task 10");
        int im;
        String ee;
        System.out.println("enter a number");
        im=sc.nextInt();
        ee=Integer.toString(im);
        if(im%7==0 && ee.charAt(0)==7)
        {
            System.out.println(im+"is a buzz");
            
        }
        System.out.println("Task 11");
        int oo;
        double kk;
        System.out.println("enter a number");
        oo=sc.nextInt();
        kk=Math.sqrt(oo);
        if(kk%1==0)
        {
          System.out.println("is a perfect square"); 
        }
        else
        {
          System.out.println("is not a perfect square"); 
        }
        
        
    }
}