package basic.m05;
import java.util.Scanner;
public class P2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.println("NEON number");
        System.out.println("enter a number");
        int c,sum=0,o;
        n1=sc.nextInt();
        o=n1*n1;
        while(o>0)
        {
            c=o%10;
            sum=sum+c;
            o=o/10;
        }
        if(sum==n1)
        {
            System.out.println("NEON");
        }
        else{System.out.println("not NEON");}
        System.out.println("ARMSTRONG number");
        System.out.println("enter a number");
        n2=sc.nextInt();
        int d,sum1=0,k;
        k=n2*n2*n2;
        while(k>0)
        {
            d=k%10;
            sum1=sum1+d;
            k=k/10;
        }
        if(sum1==n2)
        {
            System.out.println("ARMSTRONG");
        }
        else{System.out.println("not ARMSTRONG");}
        System.out.println("BINARY TO DECIMAL number");
        System.out.println("enter a binary number");
        int s,count=0;
        double sum2=0;
        n3=sc.nextInt();
        while(n3!=0)
        {
            s=n3%10;
            sum2=sum2+(s*(Math.pow(2,count)));
            count=count+1;
            n3=n3/10;
        }
        System.out.println(sum2);
        System.out.println("PALINDROME number");
        System.out.println("enter a number");
        n4=sc.nextInt();
        int rn=0,p;
        while(n4!=0)
        {
            p=n4%10;
            rn=(rn*10)+p;
            n4=n4/10;
        }
        if(rn==n4)
        {
            System.out.println("PALINDROME");
        }
        else{System.out.println("not PALINDROME");}
        
        
        
    }
}