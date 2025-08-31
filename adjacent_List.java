import java.util.Scanner;
public class adjacent_List 
{
    
    public static void print(int a[][],int n)
    {
        for(int i=0;i<n;i++ )
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void newVertice(int a[][],int b,int c)
    {
        a[b-1][c-1]=1;
        //assume its  directional
    }

    public static void Diss(int a[][],int b,int c)
    {
        a[b-1][c-1]=0;
        //assume its  directional
    }

    public static void newnode(int a[][],int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n-1;i++)
        {
            System.out.printf("%d to %d:",i+1,n);
            a[i][n-1]=sc.nextInt();
        }
        a[n-1][n-1]=0;
        for(int i=0;i<n-1;i++)
        {
            System.out.printf("%d to %d:",n,i+1);
            a[n-1][i]=sc.nextInt();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("no of nodes=");
        int n=sc.nextInt();
        int a[][]= new int[10][10];
        for(int i=0;i<n;i++ )
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    System.out.printf("%d to %d:",i+1,j+1);
                     a[i][j]=sc.nextInt();
                }
                else
                {
                    a[i][j]=0;
                }
            }
        }
        while(true)
        {
            System.out.printf("_____________________________________________________________________________\n");
            System.out.print("1)print"+"\n"+"2)connect"+"\n"+"3)Dissconnect"+"\n"+"4)New node"+"\n");
            System.out.printf("_____________________________________________________________________________\n");
            System.out.print("What to do:");
            int w=sc.nextInt();
            if(w==1)
            {
                print(a,n);
            }
            else if(w==2)
            {
                System.out.print("connect:");
                int one=sc.nextInt();
                System.out.print("And:");
                int two=sc.nextInt();
                if(a[one-1][two-1]==0)
                {
                    newVertice(a,one,two);
                }
            }
            else if(w==3)
            {
                System.out.print("disconnect:");
                int on=sc.nextInt();
                System.out.print("And:");
                int tw=sc.nextInt();
                if(a[on-1][tw-1]!=0)
                {
                    Diss(a,on,tw);
                }

            }
            else if(w==4)
            {
                n=n+1;
                newnode(a,n);
            }
            

            
        }


       
    }
}
