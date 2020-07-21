public class Pattern1

{

      public static void main(String args[])

      {

          int a=1;

          for(int i=1;i<=5;i++)

          {

              System.out.println(a++);

             for(int b=1;b<=i;b++)

          {

            if(i%2!=0)

            System.out.print("* ");

            else

            System.out.print("# ");

          }

           System.out.println(" " );

         }

      
        }
    }