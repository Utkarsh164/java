import java.util.*;
import java.util.LinkedList;

public class KahnSAlgorithm 
{
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

        int[] innodes=new int[n];
        for(int i=0;i<n;i++)
        {
            for(Integer index:graph.get(i))
            {
                innodes[index]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            if(innodes[i]==0)
            {
                q.add(i);
            }
        }
        
        ArrayList<Integer> a=new ArrayList<>();
        
        while (!q.isEmpty()) 
        {
            int node=q.remove();
            //toposort
            a.add(node);
            for(Integer cur:graph.get(node))
            {
                innodes[cur]--;
                if(innodes[cur]==0)
                {
                    q.add(cur);
                }
            }
        }
        System.out.println(a);
    }    
    
}
