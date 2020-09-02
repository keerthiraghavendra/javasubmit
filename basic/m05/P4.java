package basic.m05;
import java.util.Scanner;
public class P4
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6;
        System.out.println("SPECIAL NUMBER");
        System.out.println("Enter a number");
        int e,fact=1,sum=0,temp;
        n1=sc.nextInt();
        temp=n1;
        while(n1!=0)
        {
            e=n1%10;
            fact=1;
            for(int i=1;i<=e;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n1=n1/10;
            
        }
        if (sum==temp)
        {
            System.out.println("SPECIAL NUMBER");
        }
        else{System.out.println("not SPECIAL NUMBER");}
        
        
        
        System.out.println("MAGIC NUMBER");
        System.out.println("Enter a number");
        int y,k,et=0;
        n2=sc.nextInt();
        y=n2;
        while(y>9)
        {
           k=y;
           et=0;
           while(k!=0)
           {
               et=et+(k%10);
               k=k/10;
               
           }
           
           y=et;
        }
        if (y==1)
        {
            System.out.println("MAGIC NUMBER");
        }
        else{System.out.println("not MAGIC NUMBER");}
        
        
        
        System.out.println("HAPPY NUMBER");
        System.out.println("Enter a number");
        n3=sc.nextInt();
        int sumo=0,yh;
        int kh;
        yh=n3;
        
        while(yh>9)
        {
           kh=yh;
           sumo=0;
           while(kh!=0)
            {
               sumo=sumo+((kh%10)*(kh%10));
               kh=kh/10;
               
            }
           yh=sumo;
           System.out.println(yh);
        }
        if (yh==1)
        {
            System.out.println("HAPPY NUMBER");
        }
        else{System.out.println("not HAPPY NUMBER");}
        
        
        System.out.println("DISARIUM NUMBER");
        System.out.println("Enter a number");
        double cnt=0,summ=0,po;
        int tmp;
        n4=sc.nextInt();
        po=n4;
        tmp=n4;
        while(tmp!=0)
        {
            cnt=cnt+1;
            tmp=tmp/10;
        }
        System.out.println(cnt);
        for(double i=cnt;i>=1;i--)
        {
            summ=summ+Math.pow((n4%10),i);
            n4=n4/10;
        }
        if (summ==po)
        {
            System.out.println("DISARIUM NUMBER");
        }
        else{System.out.println("not DISARIUM NUMBER");}
        
        
        System.out.println("UNIQUE NUMBER");
        System.out.println("Enter a number");
        n5=sc.nextInt();
        int re,c,qq,cft=0,ss,iop=0;
        re=n5;
        while(n5!=0)
        {
            qq=re;
            c=n5%10;
            while(qq!=0)
            {
                ss=qq%10;
                if(c==ss)
                {
                    cft=cft+1;
                    qq=qq/10;
                }
                else
                {
                    qq=qq/10;
                }
                if(cft>1)
                {
                  iop=1;
                  System.out.println("not UNIQUE NUMBER");
                  break;
                }
                
                
            }
            if(iop==0)
            {
                System.out.println("UNIQUE NUMBER");
            }
            n5=n5/10;
            cft=0;
        }
        /*System.out.println("PRIMORIAL NUMBER");
        System.out.println("Enter a number");
        n6=sc.nextInt();
        int dep=0,pri=1;
        for(int i=2;i<=n6;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    dep=dep+1;
                }
            }
            if(dep==0)
            {
                pri=pri*i;
            }
            dep=0;
        }
        System.out.println(pri);*/
        
    }
    
}

