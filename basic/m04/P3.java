package basic.m04;
import java.util.Scanner;
public class P3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Task1");
        int i=1,sum=0;
        do
        {
           if (i%3==0)
           {
               sum=sum+i;
               
           }
           i++;
        }
        while(i<=20);
        System.out.println(sum);
        
        System.out.println("Task2");
        
        int tfact=1,n;
        n=sc.nextInt();
        do
        {
            tfact=tfact*n;
            n=n-3;
            
        }
        while(n>=1);
        System.out.println(tfact);
        
    }
    
}


