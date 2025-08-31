import java.util.Scanner;
public class MultiplyStrings
{
   static String m(String num1, String num2)
    {
        int n=0,N=0,s;
        
        while(num1!="")
        {
            n=n*10+(num1.charAt(0)-48);
            num1=num1.substring(1);
        }
        
        
        while(num2!="")
        {
            N=N*10+(num2.charAt(0)-48);
            num2=num2.substring(1);
        }
        
        int z=n*N;
        String c="";
        c=c+z;
        return c;
       
    }
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("First number=");
      String s=sc.next();
      System.out.print("Second number=");
      String S=sc.next();
      System.out.print(s+"x"+S+"="+m(s,S));
   }
}