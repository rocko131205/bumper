import java.util.*;
public class employe
{
   
    public static void main(String args[])
    {
   
        Scanner sc=new Scanner(System.in);
            float basesalary=sc.nextInt();
            float Hra=sc.nextInt();
         String employee=sc.nextLine(); 
    
  
  System.out.print("Employee name is-" + employee );  
   employe av =new employe();
  float total= av.TotalSalary(basesalary,Hra);
  System.out.print( "Total salary is-" + total); 
  
    }
 
    
    public static float TotalSalary(float basesalary,float hra )
    {
    float totalsalary=basesalary+(50*hra)/100;
     
    return totalsalary;
    }
    
    
}
        
    
        