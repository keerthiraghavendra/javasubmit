package basic.m04;
import java.util.Scanner;
public class P4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,dfact=1;
        System.out.println("Task 1");
        n=sc.nextInt();
        for(i=n;i>=1;i=i-2)
        {
            dfact=dfact*i;
            
        }
        System.out.println(dfact);
    }
    
}



