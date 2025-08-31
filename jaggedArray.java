import java.util.Scanner;

public class jaggedArray 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("no of rows:");
        int r=sc.nextInt();
        int a[][]=new int[r][];
        for(int i=0;i<r;i++)
        {
            System.out.print("no of Coloumn:");
            int c=sc.nextInt();
            int b[]=new int[c];
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter:");
                int n=sc.nextInt();
                b[j]=n;
            }
            a[i]=b;
        }

    for (int i = 0; i < a.length; i++) 
    {
        for (int j = 0; j < a[i].length; j++) 
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println("");
    }
}
}


