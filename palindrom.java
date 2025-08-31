import java.util.*;
public class palindrom 
{
    static boolean f(String s,int i)
    {
        while(i<(s.length()-1)/2)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
            else
            {
                i=i+1;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        String s=sc.next();
        System.out.print(f(s,0));
    }
    
}
