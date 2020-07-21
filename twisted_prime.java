import java.util.*;
class twisted_prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        while(n>0)
        {
           int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        int c1=0;
        for(int i=1;i<=a;i++)
        {
            
            if(a%i==0)
            c1++;
        }
        int c2=0;
        for(int i=1;i<=rev;i++)
        {
           
            if(rev%i==0)
            c2++;
        }
        if(c1==2&&c2==2)
        {
            System.out.println("Twisted prime");
        }
        else
        {
            System.out.println("Invalid no");
        }
    }
}
       
            