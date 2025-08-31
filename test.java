import java.util.*;
import java.util.LinkedList;
public class test {
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    static void create(int n) //TakeUForward
    {
            for(int i=0;i<n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(2).add(3);
            graph.get(3).add(1);
            graph.get(4).add(0);
            graph.get(4).add(1);
            graph.get(5).add(0);
            graph.get(5).add(2);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
        int n=6;
       
        create(n);

        System.out.println("Adjecent nodes");
        for(int i=0;i<n;i++)
        {
            System.out.println(i+"="+graph.get(i));
        } 

       int[] innode=new int[n];
       for(int i=0;i<n;i++)
       {
        for(int cur:graph.get(i))
        {
            innode[cur]++;
        }
       }
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<n;i++)
       {
        if(innode[i]==0)
        {
            q.add(i);
        }
       }
       ArrayList<Integer> a=new ArrayList<>();
       while (!q.isEmpty()) 
       {
        int cur=q.remove();
        a.add(cur);
        for(int c:graph.get(cur))
        {
            innode[c]--;
            if(innode[c]==0)
            {
                q.add(c);
            }
        }
       }
       System.out.println(a);
    }    
    
}
