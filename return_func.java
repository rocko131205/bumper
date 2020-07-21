import java .util.*;
public class return_func
{
    double func(double a)
    {
        int sum=1;
        
            for(int i=1;i<=a;i++)
            {
                sum=sum*i;
            }
                return sum;
            
        
    }
        public void main (String args[])
        {
            Scanner sc=new Scanner(System.in);
            double a =sc.nextDouble();
            return_func ob=new return_func();
            double c=ob.func(a);
            System.out.println(c);
        }
        }