import java.util.Scanner;
public class NnaturalNumber
{
    static void yo(int n)
    {
        if(n==0)
        {
            return;
        }
        yo(n-1);
        System.out.print(n+",");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        yo(n);
    }
    
}
