
import java.util.*;
public class Series4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();
        double sum=0;
        double product=1;
        double sum1=0;
        for(int i=1;i<=x;i++)
        {
           sum=sum+(i+1);
           product=product*(i+1);
           sum1=sum1+(sum/product);
           System.out.println(sum1);
        }
        }
    }
        