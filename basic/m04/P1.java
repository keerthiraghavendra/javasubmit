package basic.m04;
import java.util.Scanner;
public class P1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Task 1");
        int n,i,n1,m;
        System.out.println("enter a number n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
        System.out.println("Task 2");
        System.out.println("enter a number n1");
        n1=sc.nextInt();
        System.out.println("enter a number m");
        m=sc.nextInt();
        for(i=n1;i<=m;i++)
        {
            System.out.println(i);
        }
        System.out.println("Task 3");
        int n2;
        n2=sc.nextInt();
         for(i=1;i<=n2;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
        System.out.println("Task 4");
        int n3;
        n3=sc.nextInt();
        for(i=2;i<=n3;i=i+2)
         {
            
           System.out.println(i);
           
         }
        
        
        
        
        
    }
    
}

