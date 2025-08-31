import java.util.Scanner;
public class OddEvenWithoutMod 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int a=sc.nextInt();
        if(a==0)
        {
            System.out.print("You naughty naughty");
        }
        else if((a^(a-1))==1)
        {
            System.out.print("odd");
        }
        else if((a^(a-1))!=1)
        {
            System.out.print("Even");
        }
    }
}
