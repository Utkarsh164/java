import java.util.Scanner;
public class NoOfDigit 
{
    static int no(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return no(n/10)+1;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        System.out.print(no(n));
    }
}
