package basic.m05;
import java.util.Scanner;
public class P3
{
    public static void main()
    {
        
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,n4,n5,n;
        System.out.println("AUTOMORPHIC NUMBER");
        System.out.println("enter a number");
        int l=0,q,i=1;
        double sum=0;
        n1=sc.nextInt();
        while(n1!=0)
        {
            l=l+1;
            n1=n1/10;
        }
        q=n1*n1;
        while(i<=l)
        {
            sum=sum+((q%10)*(Math.pow(10,(i-1))));
            i=i+1;
            q=q/10;
        }
        if(sum==q)
        {
            System.out.println("AUTOMORPHIC NUMBER");
        }
        else{System.out.println("not AUTOMORPHIC NUMBER");}
        
       
        System.out.println("LCM HCF");
        int temp,temp1,temp2,lcm,hcf;
        System.out.println("enter 2 numbers");
        n2=sc.nextInt();
        n=sc.nextInt();
        temp1 = n;
        temp2 = n2;

        while(temp2 != 0)
        {
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
        }

        hcf = temp1;
        lcm = (n*n2)/hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
        
        System.out.println("DECIMAL TO BINARY");
        System.out.println("enter a decimal number");
        int bin=0,o,bina=0;
        n3=sc.nextInt();
        while(n3!=0)
        {
            bin=(bin*10)+(n3%2);
            n3=n3/2;
            
        }
        while(bin!=0)
        {
            o=bin%10;
            bin=bin/10;
            bina=(bina*10)+o;
        }
        
        System.out.println(bina);
        System.out.println("DECIMAL TO OCTAL");
        System.out.println("enter a decimal number");
        n4=sc.nextInt();
        int binp=0,op,binap=0,x=0;

        
        while(n4!=0)
        {
            binp=(binp*10)+(n4%8);
            n4=n4/8;
            
        }
        while(binp!=0)
        {
            op=binp%10;
            binp=binp/10;
            binap=(binap*10)+op;
        }
        System.out.println(binap);
        
        
        System.out.println("DECIMAL TO HEXADECIMAL");
        System.out.println("enter a decimal number");
        n5=sc.nextInt();
        int binpp=0,opp,binapp=0,xp=0;

        
        while(n5!=0)
        {
            binpp=(binpp*10)+(n5%16);
            n5=n5/16;
            
        }
        while(binpp!=0)
        {
            opp=binpp%10;
            binpp=binpp/10;
            binapp=(binapp*10)+opp;
        }
        System.out.println(binapp);
        System.out.println("BUZZ NUMBER");
        n=1;
        int ir=0;
        while(ir<10)
        {
           if(n%7==0 || n%10==7)
           {
               ir=ir+1;
               
               System.out.println(n);
               n=n+1;
            }
            else{n=n+1;}
        }
        
    }
}