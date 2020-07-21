import java.util.*;
public class swap_function
{
    Scanner sc=new Scanner(System.in);
    int c;
    public void swap(int a,int b)
    {
       
       c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
    }
    public void main(String args[])
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap_function ob = new swap_function();
        ob.swap(a,b);
        
    }
    }
       
        
    