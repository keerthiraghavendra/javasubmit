package basic.m05;
import java.util.Scanner;
public class P1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Task 1");
        int i,n;
        double M;
        System.out.println("Enter n for mersenne");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            M=((Math.pow(2,i))-1);
            System.out.print(M+",");
        }
        
        System.out.println("Task 2");
        int n1,count=0;
        System.out.println("Enter n for its no of factors");
        n1=sc.nextInt();
        for(int i1=1;i1<=n1;i1++)
        {
            if(n1%i1==0)
            {
                count=count+1;
            }
            
        }
        System.out.println(count);
        
        System.out.println("Task 3");
        int n2,n3,sum1=0,sum2=0;
        System.out.println("Enter n1 and n2 for amicable");
        n2=sc.nextInt();
        n3=sc.nextInt();
        for(int i2=1;i2<n2;i2++)
        {
            if(n2%i2==0)
            {
                sum1=sum1+i2;
            }
            
        }
        for(int i3=1;i3<n2;i3++)
        {
            if(n3%i3==0)
            {
                sum2=sum2+i3;
            }
            
        }
        if(sum1==n3 && sum2==n2)
        {
          System.out.println("amicable");  
        }
        else{System.out.println("not amicable");}
        
        System.out.println("Task 4");
        int n4,sum3=0;
        System.out.println("Enter n for perfect,deficient,abundant");
        n4=sc.nextInt();
        for(int i5=1;i5<=n4;i5++)
        {
            if(n4%i5==0)
            {
                sum3=sum3+i5;
            }
            
        }
        if(sum3<2*n4)
        {
          System.out.println("Deficient number");  
        }
        if(sum3>2*n4)
        {
          System.out.println("abundant number");  
        }
        if(sum3==2*n4)
        {
          System.out.println("perfect number");  
        }
        
        System.out.println("Task 5");
        int n5,county=0;
        System.out.println("Enter n for prime or composite");
        n5=sc.nextInt();
        for(int i6=1;i6<=n5;i6++)
        {
            if(n5%i6==0)
            {
                county=county+1;
            }
            
        }
        if(county>2)
        {
           System.out.println("composite"); 
            
        }
        else{System.out.println("prime");}
        
    }
    
}

