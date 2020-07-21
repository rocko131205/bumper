import java.util.*;
class area_menu_driven
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c; int a,b;
        System.out.println("1.area of circle");
        System.out.println("2.area of suare");
        System.out.println("3.area of rectangle");
         System.out.println("Enter your choice");
         
         int ch=sc.nextInt();
        
         switch (ch)
         {
             case 1:
             System.out.println("enter radius");
             a=sc.nextInt();
             c=3.14f*a*a;
             System.out.println("area="+c);
             break;
             case 2:
             System.out.println("enter side");
             a=sc.nextInt();
             c=a*a;
             
             System.out.println("area="+c);
             break;
             case 3:
             System.out.println("enter length and breath");
             a=sc.nextInt();
             b=sc.nextInt();
             c=a*b;
             
             System.out.println("area"+c);
             break;
             default:
             System.out.println("Invalid");
             break;
            }
            }
        }