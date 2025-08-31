import  java.util.Scanner;
public class RotateBestOne 
{
    
    static void rotate(int a[],int s,int k)
    {
        while(s<=k)
        {
            int t=a[s];
            a[s]=a[k];
            a[k]=t;
            s++;k--;
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("k=");
        int k=sc.nextInt();
        k=k%a.length;
        if(k<0)
        {
            k=a.length+k;
        }
       
            rotate(a,0,k-1);
            rotate(a,k,a.length-1);
            rotate(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    
}
