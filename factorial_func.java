import java .util.*;
public class factorial_func
{
    Scanner sc=new Scanner (System.in);
    public void factorial(int a)
    {
        int sum=1;
        for(int i=1;i<=a;i++)
        
        {
            
            sum=sum*i;
        }
            System.out.println(sum);
        }
        public void main(String args[])
        {
            int a=sc.nextInt();
            
            factorial_func ob=new  factorial_func();
            ob.factorial(a);
        }
    }
            
            
        