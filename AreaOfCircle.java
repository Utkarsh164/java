import java.util.Scanner;
public class AreaOfCircle
{
    static float ar(int r,int i)
    {
        if(i==0)
        {
            return 0;
        }
        return (float)(r+ar(r,i-1));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("r=");
        int a=sc.nextInt();
        System.out.print("Area="+(3.14*ar(a,a)));
    }
}
