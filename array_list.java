import java.util.ArrayList;
import java.util.Scanner;
public class array_list
{
    public static void main(String args[])
    {
       ArrayList<Integer> ar=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       System.out.print("size=");
       int n=sc.nextInt();

       //insert
       int a;
       for(int i=0;i<n;i++)
       {
        a=sc.nextInt();
        ar.add(a);
       }

       //get

       for(int i=0;i<ar.size();i++)
       {
        
        System.out.print(ar.get(i)+",");
       }
       System.out.println();


       //insert element in between
       ar.add(0,10);
       for(int i=0;i<ar.size();i++)
       {
        
        System.out.print(ar.get(i)+",");
       }
       System.out.println();
  

       //change value at index
       ar.set(0,20);
       for(int i=0;i<ar.size();i++)
       {
        
        System.out.print(ar.get(i)+",");
       }
       System.out.println();


       //remove
       ar.remove(3);
       for(int i=0;i<ar.size();i++)
       {
        
        System.out.print(ar.get(i)+",");
       }
       System.out.println();

       System.out.print(ar);
       sc.close();

    }

    
}
