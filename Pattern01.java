import java.util.*;

public class Pattern01 
{
    static void pattern(int n)
    {
        
        for(int i=0;i<n;i++)
        {
            int p;
            if(i%2==0)
            {
                p=0;
            }
            else
            {
                p=1;
            }
            for(int j=0;j<=i;j++)
            {
                if(p==0)
                {
                    p=1;
                    System.out.print(p);
                }
                else
                {
                    p=0;
                    System.out.print(p);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Length=");
        int n=sc.nextInt();
        pattern(n);
    }

}
