package basic.m07;
import java.util.Scanner;
public class P1
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       int n1,n2,sum=0;
       System.out.println("Enter n for the series 0,1,3,5,7,15");
       n1=sc.nextInt();
       System.out.print("0,");
       for(int i=0;i<=n1;i++)
       {
       
               sum=(sum*2)+1;
               System.out.print(","+sum);
           
        }
       System.out.println("Enter n for the series 1,1,11,111");
       n2=sc.nextInt();
       int s = 0, c;                                          
       for (c = 1; c <= n2; c++)                           
       {
           s = s * 10 + 1;
           System.out.print(s + " ");
       }                    
       
    }
}