import java.util.*;
public class factorial 
{
    static int fac(int a)
    {
        if(a==1)
        {
            return 1;
        }
        return a*fac(a-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int a=sc.nextInt();
        System.out.print(fac(a));
    }
}
