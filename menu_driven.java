import java.util.*;
class menu_driven
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        System.out.println("1.Add");
        System.out.println("2.sub");
        System.out.println("3.multiplication");
        System.out.println("4.div");
         System.out.println("Enter your choice");
        int ch=sc.nextInt();
         System.out.println("enter any two number");
         int b=sc.nextInt();
         int a=sc.nextInt();
         switch (ch)
         {
             case 1:
             c=a+b;
             System.out.println("sum="+c);
             break;
             case 2:
             c=a-b;
             System.out.println("sub="+c);
             break;
             case 3:
             c=a*b;
             System.out.println("multiplication="+c);
             break;
             
             case 4:
             c=a/b;
             System.out.println("divide="+c);
             break;
             default:
             System.out.println("Invalid");
             break;
            }
        }
    }
             
             
             
             
             
             
           
             
        