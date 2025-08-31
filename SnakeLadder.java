import java.util.Scanner;

public class SnakeLadder 
{
        public static void main(String args[])
    {
        int b[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,2,17,18,19,20,
                 21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,6,39,40,
                 41,42,43,44,68,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                 61,62,22,64,65,66,67,68,69,70,71,72,73,74,99,76,77,78,79,80,
                 81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,2,99,100};
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("a[%d]=",i+1);
            d[i]=sc.nextInt();
        }
        int p=0,s=0,l=0,i=0;
        while(i<n)
        {
            if(p+d[i]<100)
            {p=p+d[i];
            if(b[p-1]!=p)
            {
                if(b[p-1]<p)
                {
                    s=s+1;
                    p=b[p-1];
                }
                else if(b[p-1]>p)
                {
                    l=l+1;
                    p=b[p-1];
                }
            }
           }
            i++;
        }
        System.out.println("position="+p);
        System.out.println("Snakes="+s);
        System.out.println("Ladder="+l);
    }
    
}
