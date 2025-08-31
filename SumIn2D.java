import java.util.*;
public class SumIn2D
{
    static void sum(int a[][],int s)
    {
        for(int i=0;i<3-1;i++)
        {
            for(int j=0;j<3;j++)
            {
                int c=a[i][j];
                for(int k=i+1;k<3;k++)
                {
                    for(int z=0;z<3;z++)
                    {
                        if(c+a[k][z]==s)
                        {
                            System.out.println(c+","+a[k][z]);
                        }
                    }
                }
            }
        }
    }
    public static void main(String args[])
    {
        int a[][]={
                    {1,2,3},
                    {4,3,6},
                    {0,4,9}
                   };
        Scanner sc=new Scanner(System.in);
        System.out.print("s=");
        int s=sc.nextInt();
         sum(a,s);
    }
}
