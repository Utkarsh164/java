//contains all alpha
import java.io.*;
import java.util.*;
public class pangram 
{
    static boolean r(String s)
    {

        int i=0;
        s=s.toLowerCase();
        Set<String> h = new HashSet<String>();
        while(i<s.length()-1)
        {
            String a="";
            
             a=a+s.charAt(i);
            if(h.contains(a)==true)
            {}
            else
            {
                h.add(a);
            }
            if(h.size()==26)
            {
            return true;
            }
            
            i++;
        }
        return false;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("s=");
    String s=sc.next();
    System.out.print(r(s));
}}
