import java.util.Scanner;
public class powerOfTwo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int a=sc.nextInt();
        if((a&(a-1))==0)
        {
            System.out.print("power of 2");
        }
        else
            System.out.print("not power of 2");
    }
}
