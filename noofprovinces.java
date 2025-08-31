import java.util.*;

public class noofprovinces 
{
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    static void create(int n,int m) //TakeUForward
    {
            for(int i=0;i<=n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(1).add(2);
            graph.get(2).add(3);
            graph.get(2).add(1);
            graph.get(3).add(2);
            graph.get(4).add(5);
            graph.get(6).add(5);
            graph.get(5).add(4);
            graph.get(5).add(6);
            graph.get(7).add(8);
            graph.get(8).add(7);
            
    }


    static void dfs(boolean[] vis,int node)
   {
    
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
        //no of provinces main question
       boolean[] visited=new boolean[n+1];
       int c=0;
       for(int i=1;i<=n;i++)
       {
        if(visited[i]==false)
        {
            c++;
            dfs(visited, i);
        }
       }
       System.out.println("no of provinces="+c);
    }
    
}
