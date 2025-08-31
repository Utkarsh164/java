import java.util.Scanner;
public class ReverseStringR 
{
    static String rev(String s,String r,int i)
    {
        if(i<0)
        {
            return r;
        }
        return rev(s,r+s.charAt(i),i-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("String=");
        String s=sc.next();
        System.out.print("Reversed="+rev(s,"",s.length()-1)); 
    }
    
}
