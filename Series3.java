import java .util.*;
public class Series3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter N");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum= sum+Math.pow(x,n);
            System.out.println(sum);
        }
    }
}
            
        
