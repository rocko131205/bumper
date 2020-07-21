import java .util.*;

public class Student

{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        System.out.println(" enter your name:");

        String name=sc.nextLine();

        System.out.println(" enter your roll number:");

        int roll=sc.nextInt();

        System.out.println(" enter your marks of five subjects one by one out of 100");

        int sub1=sc.nextInt();

        int sub2=sc.nextInt();

        int sub3=sc.nextInt();

        int sub4=sc.nextInt();

        int sub5=sc.nextInt();

        double percentage=((sub1+sub2+sub3+sub4+sub5)/500)*100;

        if(percentage>=90)

        {

            System.out.println("The stream for you will be Science with Computers");

        }

        else if(percentage>=80 && percentage<89)

        {

            System.out.println("The stream for you will be Science without Computers");

        }

        else if(percentage>=70 && percentage<79)

        {

            System.out.println("The stream for you will be Commerce with Maths");

        }

        else 

        {

            System.out.println("The stream for you will be Commerce without Maths");

        }

    }

}