import java.util.*;
public class Cbr
{
   static int a,b;
   void swap(Cbr ob1)
   {
       int tmp=ob1.a;
       ob1.a=ob1.b;
       ob1.b=tmp;
       System.out.println(ob1.a+" "+ob1.b);
    }
    public static void main (String args[])
    {
    Scanner sc=new Scanner(System.in);
    Cbr ob=new Cbr();
    System.out.println(" Enter any two number");
    ob.a=sc.nextInt();
    ob.b=sc.nextInt();
    ob.swap(ob);
    System.out.println(ob.a+" "+ob.b);
}
}