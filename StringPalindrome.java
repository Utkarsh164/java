import java.util.*;
public class StringPalindrome 
{
    static boolean p(String s,int i)
    {
        if(i<(s.length()-1)/2)
        {
            if(s.charAt(i)==s.charAt(s.length()-i-1))
            {
                return p(s,i+1);
            }
            else
            {
                return false;

            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("string=");
        String s=sc.next();
        System.out.print(p(s,0));
    }
    
}
