public class CycleSort {
    public static void main(String[] args) {
        int a[]={4,3,1,5,2};

        int i=0;
        while (i<a.length) 
        {
            int current=a[i]-1;
            if(a[current]!=a[i])
            {
                int temp=a[current];
                a[current]=a[i];
                a[i]=temp;
            }
            else{i++;}
        }

        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
