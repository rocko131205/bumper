class Date
{
    int dd,mm,yy;
    Date()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    Date(int a,int b,int c)
    {
        dd=a;
        mm=b;
        yy=c;
    }
    public static void main(String args[])
    {
        Date date=new Date(1,1,2014);
        System.out.println(date.dd+date.mm+date.yy);
    
    Date date1=new Date();
    System.out.println(date1.dd +date1.mm + date1.yy);
}
}



    
    