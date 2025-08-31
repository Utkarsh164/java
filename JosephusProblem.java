import java.util.Scanner;
public class JosephusProblem
{
    static int jp(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (jp(n-1,k)+k)%n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.print("k=");
        int k=sc.nextInt();
        System.out.print(jp(n,k));
    }
}
