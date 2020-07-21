import java .util.*;
public class rt
{
    String name;
    String coach;
    long mobno;
    int amt;

    
    void accept(String ab,long a,int b,String bc)
    {
        name=ab;
        System.out.println(name);
        coach=bc;
        mobno=a;
        amt=b;
    }
    void display()
    {
        System.out.println(name);
      System.out.println(coach);
      System.out.println(mobno);
      System.out.println(amt);
    }
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner (System.in);
         System.out.println("enter your name");
        String a=sc.nextLine();
      
          System.out.println("mob");
        long c= sc.nextLong();
         System.out.println("For first class it700");
        System.out.println("second ac it is500");
        System.out.println("third ac it is 250");
        System.out.println("Sleeper it is none");
         String b=sc.nextLine();
        int d=sc.nextInt();
       
        rt ob=new rt();
        ob.accept(a,c,d,b);
        ob.display();
    
}
}
     
        
        
        
    