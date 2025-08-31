//Array list is optional
import java.util.*;
public class Subsequence
{
    static ArrayList<String> a=new ArrayList<String>();
    static void s(String s,String r)
    {
        if(s=="")
        {
            a.add(r);
            return;
        }
        s(s.substring(1),r+s.charAt(0));//0th element is picked
        s(s.substring(1),r);//0th element is not picked
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("String=");
        String s=sc.next();
        s(s,"");
        System.out.print(a);
    }
}