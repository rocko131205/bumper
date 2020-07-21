public class cons1_sS1
{
    
        double p;
        double t;
        double r;
        double si;
        cons1_sS1()
        {
            p=10000;
            t=2;
            r=5;
           
        }
        void calc()
        {
            si=(p*t*r)/100;
            System.out.println(si);
        }
        public static void main(String args[])
    {
        cons1_sS1 sc=new cons1_sS1();
    }
}

            
            
        