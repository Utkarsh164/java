import java.util.*;
public class mark
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[9];
        for(int i=0;i<6;i++)
        {
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<6;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}