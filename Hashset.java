import java.util.*;
public class Hashset 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<>();


        System.out.print("Size=");
        int n=sc.nextInt();
        int a;

        System.out.print("Element=");
        a=sc.nextInt();
        h.add(a);
        h.add(30);


        for(int i=0;i<n;i++)
        {
            //insearting n no of elements in hashset
            System.out.print("Element=");
            a=sc.nextInt();
            h.add(a);            
        }


        //printing elements from hashset
        System.out.print(h);     
        
        //searching / contain
        System.out.println();
        if(h.contains(4)==true)
        {
            System.out.println("contains");
        }
        else{System.out.print("Do not contain");}


        //remove
        h.remove(30);
        System.out.println(h);

        //size
        System.out.println(h.size());
        
        //itrator
        @SuppressWarnings("rawtypes")
        Iterator i=h.iterator();
        while(i.hasNext()==true)
        {
            System.out.println(i.next());
        }

        sc.close();
    }
}
