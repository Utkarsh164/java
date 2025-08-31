import java.util.Scanner;
public class angram 
{
    static boolean isAnagram(String s, String t) 
    {
        if(s.length()==t.length())
        {
           int a[]=new int[26];
           int b[]=new int[26];
           for(int i=0;i<s.length();i++)
           {
            a[s.charAt(i)-'a']=a[s.charAt(i)-'a']+1;
            b[t.charAt(i)-'a']=b[t.charAt(i)-'a']+1;
           }
           for(int i=0;i<26;i++)
           {
             if(a[i]!=b[i])
             {
                return false;
             }
           }
           return true;
        }
        
        return false;
    }
   // a[s.charAt(0)-48]
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        String s=sc.next();
        System.out.print("t=");
        String t=sc.next();


        System.out.print(isAnagram(s,t));
    }
}
