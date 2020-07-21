import java.util.*;
public class over
{
    int volume(int a)
    {
        int b=a*a*a;
      return b;
    }
    int volume(int c, int d, int e)
    {
        int a=c*d*e;
        return a;
    }
    double volume(double r)
    {
        double a=4/3*3.14*r*r*r;
        return a;
    }
    public void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter any one value");
        int a=sc.nextInt();
         System.out.println("Enter any three value");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
         System.out.println("Enter any one value");
        double r=sc.nextDouble();
       over ob=new over();
      int f=  ob.volume(a);
      System.out.println(f);
       int g= ob.volume(c,d,e);
       System.out.println(g);
        double i=ob.volume(r);
        System.out.println(i);
    }
    }
        
        
    