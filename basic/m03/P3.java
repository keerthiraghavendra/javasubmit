package basic.m03;
import java.util.Scanner;
public class P3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Task1");
        double wt,ch;
        System.out.println("Enter wt");
        wt=sc.nextDouble();
        if(wt<10)
        {
          ch=20*wt;
          System.out.println("charge:"+ch);  
        }
        else if(wt>10 && wt<30)
        {
          ch=15*(wt-10)+200;
          System.out.println("charge:"+ch);  
        }
        else if(wt>30 && wt<60)
        {
          ch=10*(wt-30)+200+3000;
          System.out.println("charge:"+ch);  
        }
        else if(wt>60)
        {
          ch=5*(wt-60)+200+3000+3000;
          System.out.println("charge:"+ch);  
        }
        
        System.out.println("Task2");
        double day,cha;
        System.out.println("Enter number of days late");
        day=sc.nextDouble();
        if(day<5)
        {
          ch=40*day;
          System.out.println("charge:"+ch);  
        }
        else if(day>5 && day<11)
        {
          ch=65*day;
          System.out.println("charge:"+ch);  
        }
        else if(day>10)
        {
          ch=80*day;
          System.out.println("charge:"+ch);  
        }
        
        
    }
}