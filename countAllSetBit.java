import java.util.*;
public class countAllSetBit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("a:");
        int a=sc.nextInt();
        int c=0;
        while(a!=0)
        {
            c++;
            a=(a&(a-1));
        }
        System.out.print("No of set bit="+c);
    }
}
