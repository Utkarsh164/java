import java.util.*;
public class ShortestPathinDirectedAcyclicGraph 
{
    static ArrayList<ArrayList<int[]>> graph=new ArrayList<>();

    static void create(int n) //TakeUForward
    {
            for(int i=0;i<n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(0).add(new int[] {1,2});
            graph.get(1).add(new int[] {3,1});
            graph.get(2).add(new int[] {3,3});
            graph.get(4).add(new int[] {0,3});
            graph.get(4).add(new int[] {2,1});
            graph.get(5).add(new int[] {4,1});
            graph.get(6).add(new int[] {4,2});
            graph.get(6).add(new int[] {5,3});
    }
    static void topo(int i,int[] vis,Stack<Integer> s) 
    {
        vis[i]=1;
        for(int[] cur:graph.get(i))
        {
            if(vis[cur[0]]!=1)
            {
                topo(cur[0],vis,s);
            }
        }
        s.push(i);
    }
    public static void main(String[] args) 
    {
        int n=7;
       
        create(n);

        System.out.println("Adjecent nodes");
        for (int i = 0; i < n; i++)
        {
            System.out.print(i + " -> ");
            for (int[] edge : graph.get(i)) 
            {System.out.print(Arrays.toString(edge) + " ");
        }
        System.out.println(); 
    }//no idea what happend at this part just chat GPT 

        Stack<Integer> s=new Stack<>();
        int[] vis=new int[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                topo(i,vis,s);
            }
            
        } 

        int[] dis=new int[n];
        for(int i=0;i<n;i++)
        {
            dis[i]=Integer. MAX_VALUE;
        }
        dis[6]=0;
        while(!s.isEmpty())
        {
            int node=s.pop();
            for(int[] cur:graph.get(node) )
            {
                dis[cur[0]]=Math.min(dis[node]+cur[1],dis[cur[0]]); 
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(dis[i]+",");
        }
    }
    
}
