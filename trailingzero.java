import java.util.Scanner;
public class trailingzero
{
    static int zero(int a)
    {
        return (int)(Math.log10(a^(a&(a-1)))/Math.log10(2));
    }
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter:");
        int a=sc.nextInt();
        System.out.print(zero(a));
        sc.close();
    }
}
