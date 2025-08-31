import java.util.*;
public class RopeCutting
{
    static int cut(int n,int a,int b,int c)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n<0)
        {
            return -1;
        }
        int x=cut(n-a,a,b,c);
        int y=cut(n-b,a,b,c);
        int z=cut(n-c,a,b,c);
        int count=Math.max(x,Math.max(y,z));
        if(count==-1)
        {return -1;}
        else
        {return 1+count;}
        


    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.print("n=");
          int n=sc.nextInt();
          System.out.print("a=");
          int a=sc.nextInt();
          System.out.print("b=");
          int b=sc.nextInt();
          System.out.print("c=");
          int c=sc.nextInt();
          System.out.print("Maximum no of cuts="+cut(n,a,b,c));
    }
    
}
