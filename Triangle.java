import java.util.*;

public class Triangle 

{

   public static void main(String args[])

   {

      int a,e,f,s = 1;

      System.out.println("Enter the number of lines you need in the FloyidsTriangle");

      Scanner ob = new Scanner(System.in);

      a = ob.nextInt();



      for(e = 1; e <= a; e++) 

      {

         for(f=1;f <= e; f++)

         {

            System.out.print(" "+s++);

         }

         System.out.println();

      }

   }
}