import java.util.Scanner;

public class AllPossibleStringCombo 
{
    static void pattern(String s,String a)
    {
        if(s.length()==0)
        {
            System.out.println(a);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            pattern(s.substring(0,i)+s.substring(i+1), a+s.charAt(i));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("string=");
        String s=sc.next();
        pattern(s,"");
    }
    
}
