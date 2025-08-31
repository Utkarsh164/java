public class heap 
{
	static void heapify(int a[],int n,int i)
	{
		int largest=i;
		int l=2*i;
		int r=l+1;
		if(l<=n && a[largest]<a[l])
		{
			largest=l;
		}
		if(r<n && a[largest]<a[r])
		{
			largest=r;
		}
		if(largest!=i)
		{
			int k=a[i];
			a[i]=a[largest];
			a[largest]=k;
			heapify(a,n,largest);
		}
	}
	static void heap(int a[],int n)
	{
		for(int i=n/2;i>=0;i--)
		{
			heapify(a,n,i);
			for(int j=n-1;j>0;j--)
		{
			int k=a[n];
			a[n]=a[0];
			a[0]=k;
           heapify(a,i,0);
		}
		}
		
		 
	}
	public static void main(String args[])
	{
		int a[] = { 12, 11, 13, 5, 6, 7 };
		heap(a,5);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}
