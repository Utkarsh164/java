//in bitwise itration complexity is log(n)
// n-1 will switch most set bit all element to its left will be same and right will be zero 
import java.util.*; 
public class RightMostSetBit 
{
    static int check(int n)
    {
        if(n==0)
        {
            return 0; 
        }
       return (int)(Math.log10((n^(n&(n-1))))/Math.log10(2)+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int a=sc.nextInt();
        int c=check(a);
        System.out.print(c);
    }
}
