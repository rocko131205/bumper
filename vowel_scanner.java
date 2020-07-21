import java.util.*;
class vowel_scanner
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char a=sc.next().charAt(0);
        switch (a)
        {
            case 1:
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        
            System.out.println("it is a vowel");
            break;
            default:
            System.out.println("consonant");
            break;
        }
    }
}