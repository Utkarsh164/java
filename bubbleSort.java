public class bubbleSort {

    public static void main(String[] args) {

        //last mai subse bade no ko dalna
        
        int a[]={3,2,9,1,6,7,8}; 

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=1;j<a.length-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
