import java.util.*;
public class LetterCombination 
{
   static String a[]={"","","abc","def","ghi","jkl","mno","pqrs","vtu","wxyz"};
   static void key(String s,String r)
   {
    if(s=="")
    {
        System.out.println(r);
        return;
    }
    String k= a[s.charAt(0)-48];
    for(int i=0;i<k.length();i++)
    {
        key(s.substring(1),r+k.charAt(i));
    }

   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("n=");
        String s=sc.next();
        key(s,"");
        
    }
}
