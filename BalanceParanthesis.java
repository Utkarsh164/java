import java.util.*;
public class BalanceParanthesis 
{
    static void Bp(char a[],int i,int n,int o,int c)
    {
        if(i==2*n)
        {
            System.out.println(a);
        }
        if(o<n)
        {
            a[i]='(';
            Bp(a,i+1,n,o+1,c);
        }
        if(c<o)
        {
            a[i]=')';
            Bp(a,i+1,n,o,c+1);
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        char a[]=new char[2*n];
        Bp(a,0,n,0,0);
    }
}
