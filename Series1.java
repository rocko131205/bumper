 class Series1
{
public static void main(String args[])
{
int k=2;
int sum=0;
for(int i=1;i<=10;i++)
{
    if(i%2==0)
    sum=sum-k;
    else
    sum=sum+k;
    k=k+2;
}
System.out.println(sum);
}
}
        


    

    