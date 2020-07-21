import java.util.*;



public class maturityamount


{

    public static void main(String args[])

    {

        Scanner ab= new Scanner(System.in);

        System.out.println("enter your choice");

        System.out.println("enter 1 for term deposit");

        System.out.println("enter 2 for Reccuring deposit");

        int ch=ab.nextInt();

        switch(ch)

        {

            case 1:

            System.out.println("enter  principal");

            int b=ab.nextInt();

            System.out.println("enter rate of interest");

            int c= ab.nextInt();

            System.out.println("enter time period");

            int d=ab.nextInt();

            double amount=(b*(Math.pow((1+(c/100)),d)));

            System.out.println("The maturity value will be"+amount);

            break;

            case 2:

            System.out.println("enter the number of  monthly installments");

            int e=ab.nextInt();

            System.out.println("enter  rate of Interest");

            int f=ab.nextInt();

            System.out.println("enter  time period in months");

            int g=ab.nextInt();

            double Amount=((e*g)+(e*(g*(g+1)/(2*12))*(f/100)));

            System.out.println("the maturity value will be " + Amount);

            break;

            default:

            System.out.println("it is invalid since you can only choose option 1 or 2");

        }

    }

}