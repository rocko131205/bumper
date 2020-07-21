 class Scholarship
 {
    public static void main(String args[])
    {
   int regn_no ; 
   String Name; 
   int  Maths=100, Science=80, Eng=30;
   int fees=60000, sch, net;
   
   
   Scholarship Avi=new Scholarship();
   
   int sim= Avi.calc(Maths,Science,Eng);
  
   
    Avi.display(sim);
    
    
    
    
     Avi.calci1(sim,fees);
     
     
}
public int calc(int math,int scien,int english)
{
    int calculate= math+scien+english;
    return calculate;
}







public void calci1(int total,int fees)
{
    double   total2=0;
if(total<=200)
{
    total2=fees;
 System.out.println("Your Scholarship  is nil \t"+total2); 
}
else if(total>=201 && total<=240 )
{
total2=(fees)-((fees)*25/100);
System.out.println("Your Scholarship  is 25 % \t"+total2); 
}
else if(total>=241 && total<=270 )
{
total2=(fees)*0.40;
System.out.println("Your Scholarship  is 40% \t"+total2);  
}
else if(total>=271)
{
total2=(fees)*0.50;
System.out.println("Your Scholarship  is 50%\t"+total2); 
}
         
}








public void display(int abi)
{
if(abi<=200)
{
 System.out.println("Your Score is"+ abi); 

}
else if(abi>=201 && abi<=240 )
{
System.out.println("Your Score is"+ abi); 

}
else if(abi>=241 && abi<=270 )
{
System.out.println("Your Score is"+ abi);

}
else if(abi>=271)
{
System.out.println("Your Score is"+ abi);

}
}
}





       
   
