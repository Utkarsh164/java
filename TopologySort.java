import java.util.*;

public class TopologySort {
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

    static void sort(int[] vis,Stack<Integer> s,int i)
    {
        vis[i]=1;
        for(Integer cur:graph.get(i))
        {
            if(vis[cur]==0)
            {sort(vis, s, cur);}
        }
        s.push(i);
    }

    public static void main(String[] args) 
    {
        //Scanner sc=new Scanner(System.in);
        //System.out.print("N=");int n=sc.nextInt();System.out.print("M=");int m=sc.nextInt();
        int n=6;
       
        create(n);

        System.out.println("Adjecent nodes");
        for(int i=0;i<n;i++)
        {
            System.out.println(i+"="+graph.get(i));
        } 

        int[] vis=new int[n];
        Stack<Integer> s=new Stack<>(); 
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                sort(vis,s,i);
            }
        }
        while (!s.empty())
        {
            System.out.print(s.pop()+",");    
        }
        
    }    
    
}

