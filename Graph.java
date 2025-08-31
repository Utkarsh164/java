import java.util.*;
import java.util.LinkedList;

public class Graph 
{
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    static void create(int n,int m) //TakeUForward
    {
            for(int i=0;i<=n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(1).add(2);
            graph.get(1).add(3);
            graph.get(2).add(1);
            graph.get(2).add(5);
            graph.get(2).add(6);
            graph.get(6).add(2);
            graph.get(5).add(2);
            graph.get(3).add(4);
            graph.get(3).add(7);
            graph.get(3).add(1);
            graph.get(4).add(3);
            graph.get(4).add(8); 
            graph.get(8).add(4); 
            graph.get(8).add(7);
            graph.get(7).add(8);
            graph.get(7).add(3);
    }

    static ArrayList<Integer> bfs(int v)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[v+1];
        q.add(1);
       
        visited[1]=true;
        while (!q.isEmpty()) 
        {
            int a=q.remove();
          
            ans.add(a);
            for(int i=0;i<graph.get(a).size();i++)
            {
                if(visited[graph.get(a).get(i)]==false)
                {
                    visited[graph.get(a).get(i)]=true;
                    q.add(graph.get(a).get(i));
                }
            }
        }
        return ans;
    }

    static void bfsprint(int v)
    {
        
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[v+1];
        q.add(1);
        q.add(-1);
        visited[1]=true;
        while (!q.isEmpty()) 
        {
            int a=q.remove();
            if(a==-1)
            {
                if(q.isEmpty())
                {
                    break;
                }
                q.add(-1);
                System.out.println("");
            }
            else
            {
                System.out.print(a);
                for(int i=0;i<graph.get(a).size();i++)
                {
                if(visited[graph.get(a).get(i)]==false)
                {
                    visited[graph.get(a).get(i)]=true;
                    q.add(graph.get(a).get(i));
                }
                }
            }
            
        }
       
    }
   static void dfs(boolean[] vis,int node)
   {
    System.out.print(node+",");
    vis[node]=true;
    for(Integer i:graph.get(node))
    {
        if(!vis[i])
        {
            dfs(vis, i);
        }
    }
   }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //System.out.print("N=");int n=sc.nextInt();System.out.print("M=");int m=sc.nextInt();
        int n=8;
        int m=8;
        create(n,m);

        System.out.println("Adjecent nodes");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"="+graph.get(i));
        } 


        System.out.println("BFS");
        System.out.println(bfs(n));

        bfsprint(n);
        System.out.println(""); 
        boolean[] visited=new boolean[n+1];
        dfs(visited,1);
        sc.close();
    }
}
