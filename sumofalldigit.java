import java.util.Scanner;
public class sumofalldigit 
{
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return sum(n/10) +n%10;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int n=sc.nextInt();
        System.out.print(sum(n));
    }
}
