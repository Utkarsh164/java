
import java.util.*;
import java.util.LinkedList;

public class a {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void create(int n) {
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(5).add(0);
        graph.get(5).add(2);
        
    }

    public static void BFS(int n) {
        if(graph.isEmpty()){
            return;
        }
        Queue<Integer> q = new LinkedList<>();
        int vis[] = new int[n + 1];
        q.add(1);
        q.add(-1);
        vis[1] = 1;
        while (!q.isEmpty()) {
            int val = q.remove();
            if (val == -1) {
                if (q.isEmpty()) {
                    break;
                }
                q.add(-1);
                System.out.println("");
            } else {
                System.out.print(val);
                for (int i = 0; i < graph.get(val).size(); i++) {
                    if (vis[graph.get(val).get(i)] == 0) {
                        q.add(graph.get(val).get(i));
                        vis[graph.get(val).get(i)] = 1;
                    }
                }
            }
        }
    }
    public static void DFS(int node,int[] vis)
    {
        System.out.print(node+",");
        vis[node]=1;
        for(int i:graph.get(node))
        {
            if(vis[i]==0)
            {
                DFS(i, vis);
            }
        }
    }
    public static void sort(int[] vis,int idx,Stack<Integer> stack)
    {
        vis[idx]=1;
        for(Integer i:graph.get(idx))
        {
            if(vis[i]==0)
            {
                sort(vis,i,stack);
            }
        }
        stack.push(idx);
    }
    public static void main(String args[]) {
        int n = 5;
        create(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "->" + graph.get(i));
        }
        System.out.println("BFS");
        BFS(n);

        System.out.println("DFS");
        int vis[] = new int[n+1];
        DFS(0, vis);

        Stack<Integer> stack=new Stack<>();
        int v[] = new int[n+1];
        for(int i=0;i<graph.size();i++)
        {
            if(vis[i]==0)
            {
                sort(v,i,stack);
            }
        }
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+"=>");
        }
    }
}
