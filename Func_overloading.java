import java.util.*;
public class Func_overloading
{
    void volume(int a)
    {
        int b=a*a*a;
        System.out.println("volume of cube="+b);
    }
    void volume(int c, int d, int e)
    {
        int a=c*d*e;
        System.out.println("Volume of cuboid="+a);
    }
    void volume(double r)
    {
        double a=4/3*3.14*r*r*r;
        System.out.println("Volume of sphere=" +a);
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
        Func_overloading ob=new Func_overloading();
        ob.volume(a);
        ob.volume(c,d,e);
        ob.volume(r);
    }
    }
        
        
    