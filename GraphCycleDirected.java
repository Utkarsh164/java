import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphCycleDirected 
{
     static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

    static void create(int n) //TakeUForward
    {
            for(int i=0;i<=n;i++)
            {
                graph.add(new ArrayList<>());
            }
            graph.get(1).add(2);
            graph.get(2).add(3);
            graph.get(3).add(4);
            graph.get(3).add(7);
            graph.get(4).add(5);
            graph.get(5).add(6);
            //graph.get(6).add(3);
            graph.get(7).add(5);
            graph.get(8).add(9);
            graph.get(9).add(10);
            graph.get(10).add(8); 
            
    }
    static boolean cycle(int i,int[] vis)
    {
        if(vis[i]==1)
        {
            return true;
        }
        if(vis[i]==-1)
        {
            return false;
        }
        vis[i]=1;
       for(Integer cur:graph.get(i))
       {
        if(cycle(cur, vis))
        {
            return true;
        }
        vis[cur]=-1;
       }
       return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //System.out.print("N=");int n=sc.nextInt();System.out.print("M=");int m=sc.nextInt();
        int n=10;
       
        create(n);

        System.out.println("Adjecent nodes");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"="+graph.get(i));
        } 

        int[] vis=new int[n+1];
        int lk=0;
        for(int i=1;i<=n;i++)
        {
            if(vis[i]==0)
            {
                if(cycle(i,vis))
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
