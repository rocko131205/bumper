class Water
 {
    public static void main(String args[])
    {
        int day1=65;
        int day2=70;
        int day3=50;
        
        Water sin=new Water();
        
        int babu=sin.simba(day1,day2,day3);
        
        sin.display(babu);
    }
    public int simba(int da1,int da2,int da3)
    {
        int ans=da1+da2+da3;
            return ans;
     }
     
     public void display(int avi)
    {
        if(avi>300)
        {
        
        System.out.println("Tax is 2000");
    }
    else if(avi>200&&avi<300)
    {
    System.out.println("tax is1500");
}
else if(avi>100&&avi<200)
{
System.out.println("tax is1200");
}
else
{
    System.out.println("tax is500");
}
}
}

    