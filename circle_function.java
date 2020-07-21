import java.util.*;
public class circle_function
{
    Scanner sc=new Scanner(System.in);

    public void area(double r)
    {
        double ar_of_circle=3.14*r*r;
        System.out.println(ar_of_circle);
    }
    public  void main(String args[])
    {
        double r=sc.nextDouble();
        circle_function ob=new circle_function();
        ob.area(r);
    }
}
        