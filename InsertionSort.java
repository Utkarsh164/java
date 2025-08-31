public class InsertionSort 
{
    public static void main(String[] args) {
        int a[]={3,2,9,1,6,7,8};

        for(int i=0;i<a.length-1;i++)
        {

            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else{break;}
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
