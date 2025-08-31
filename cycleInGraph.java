import java.util.*;
import java.util.LinkedList;
public class cycleInGraph {
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    static void create(int n) //TakeUForward
    {
            for(int i=0;i<=n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(1).add(2);
            graph.get(1).add(3);
            graph.get(2).add(1);
            graph.get(2).add(5);
            graph.get(3).add(1);
            graph.get(3).add(4);
            graph.get(3).add(6);
            graph.get(4).add(3);
            graph.get(5).add(2);
            graph.get(5).add(7);
            graph.get(6).add(3);
            graph.get(6).add(7); 
            graph.get(7).add(5);
            graph.get(7).add(6);
    }

    static boolean DetectbyBfs(int index,boolean[] vis)
    {
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[] {index,-1});

        //q.add(new int[] {i,j,0});
        while (!q.isEmpty()) 
        {
            int[] cur=q.remove();
            int parent=cur[1];
            int node=cur[0];
            for(Integer i:graph.get(node))
            {
               if(i!=parent)
               {
                if(vis[i]==true)
                {
                    return true;
                }

                vis[i]=true;
                q.add(new int[] {i,node});

               }
            }
        }
        return false;
    }


    static boolean DetectbyDfs(int node,int parent,boolean[] vis)
    {
        vis[node]=true;
        for(Integer i:graph.get(node))
        {
          if(vis[i]!=true)
          {
            if(DetectbyDfs(i, node, vis))
            {
                return true;
            }
          }
          else if(parent!=i)
          {
            return true;
          }
            
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //System.out.print("N=");int n=sc.nextInt();System.out.print("M=");int m=sc.nextInt();
        int n=7;
       
        create(n);

        System.out.println("Adjecent nodes");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"="+graph.get(i));
        } 

       
        boolean[] vis=new boolean[n+1];
        for(int i=1;i<n+1;i++)
        {
            vis[i]=false;
        }

        int lk=0;
        for(int i=1;i<n;i++)
        {
            if(vis[i]==false)
            {
                if(DetectbyBfs(i,vis))
                {
                    lk=1;
                   System.out.println("true");
                   break;
                   
                }
            }
        }
        if(lk==0)
        {
            System.out.println("false");
        }

        //DFS

        for(int i=1;i<n+1;i++)
        {vis[i]=false;}

        lk=0;
        for(int i=1;i<n;i++)
        {
            if(vis[i]==false)
            {
                if(DetectbyDfs(i,-1,vis))
                {
                    lk=1;
                   System.out.println("true");
                   break;
                   
                }
            }
        }
        if(lk==0)
        {
            System.out.println("false");
        }
        
    }
}

