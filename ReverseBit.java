import  java.util.Scanner;
public class ReverseBit 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:");
        int n=sc.nextInt();
        int l=31,f=0,r=0;
        while(l>f)
        {
            if((n&(1<<l))!=0)
            {
                r=r|(1<<f);
            }
            if((n&(1<<f))!=0)
            {
                r=r|(1<<l);
            }
            l--;
            f++;
        }
        System.out.print(r);
    }
}
