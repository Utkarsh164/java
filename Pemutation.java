//NOT COMPLETE
import java.util.*;
public class Pemutation 
{
    static ArrayList<String> a=new ArrayList<String>();
    static void n(String s,String r,int j)
    {
        if(s=="")
        {
            a.add(r);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            n(s.substring(1),r+s.charAt(i));
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("string=");
        String s=sc.next();
        n(s,"",s.length());
        System.out.print(a);
    }
}
