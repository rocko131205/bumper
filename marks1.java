
     class marks1
{
int t1,t2,t3;
double percentage, wm;
marks1()
{
t1=412;
t2=423;
t3=430;
}
void calc1()
{
wm=((30/100)*t1)+((30/100)*t2)+((40/100)*t3);
percentage=(wm/500)*100;
}
void display()
{
System.out.println("the weighted marks is"+wm);
System.out.println("the percentage is"+percentage);
}
public static void main(String args[])
{
marks1 sc= new marks1();

sc.display();
sc.calc1();
}
}
