import java.util.*;
import java.util.LinkedList;
public class BipartiteGraphBFS {
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    static void create(int n) //TakeUForward
    {
            for(int i=0;i<=n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(1).add(2);
            graph.get(2).add(1);
            graph.get(2).add(3);
            graph.get(2).add(6);
            graph.get(3).add(2);
            graph.get(3).add(4);
            graph.get(4).add(3);
            graph.get(4).add(5);
            graph.get(4).add(7);
            graph.get(5).add(4);
            graph.get(5).add(9); 
            graph.get(7).add(4);
            graph.get(7).add(8);
            graph.get(8).add(7);
            graph.get(6).add(2);
            graph.get(6).add(9);
            graph.get(9).add(6);
            graph.get(9).add(5);
    }

    static boolean bipartite(int i,int[] vis)
    {
        vis[i]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty())
        {
            int cur=q.remove();

            for(Integer index: graph.get(cur))
            {
               if(vis[index]==0)
               {
                vis[index]=-vis[cur];
                q.add(index);
               }            
               else if(vis[cur]==vis[index])
               {
                return false;
               }
            }
            

        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //System.out.print("N=");int n=sc.nextInt();System.out.print("M=");int m=sc.nextInt();
        int n=9;
       
        create(n);

        System.out.println("Adjecent nodes");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"="+graph.get(i));
        } 



        int[] vis=new int[n+1];
        
        int lk=0;
        for(int i=1;i<n;i++)
        {
            if(vis[i]==0)
            {
                if(!bipartite(i,vis))
                {
                    lk=1;
                   System.out.println("false");
                   break;
                   
                }
            }
        }
        if(lk==0)
        {
            System.out.println("true");
        }
       


    
    }

}
