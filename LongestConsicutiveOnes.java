import java.util.Scanner;
public class LongestConsicutiveOnes 
{
    static int lol(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n=(n&(n<<1));
            
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int a=sc.nextInt();
        int c=lol(a);
        System.out.print("length of consicutive 1="+c);
    }
}
