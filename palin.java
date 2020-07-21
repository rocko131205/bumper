import java .util.*;
public class palin
{
    double pali(double a)
    {
        double rem;
        double rev=0;
        while(a>0)
    {
         rem=a%10;
         rev=rev*10+rem;
        a=a/10;
    }
    return rev;
}
public void main(String args[])
{
Scanner sc =new Scanner (System.in);
palin ob=new palin();
System.out.println("Enter any number");
double a=sc.nextDouble();
double b=ob.pali(a);
if(b==a)
{
    System.out.println("palindrome");
}
else
{
    System.out.println("not palindrome");
}
}
}

    


    
    