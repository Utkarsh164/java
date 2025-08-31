import java.util.LinkedList;
import java.util.Queue;

public class Subtree 
{
    static class node
    {
        int key;
        node left;
        node right;
        node(int key)
        {
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }

    static int i=-1;
    static class tree
    {
        
        public static node insert(int[] keys)
        {
            i++;
            if(keys[i]==-1)
            {
                return null;
            }
            node in=new node(keys[i]);
            in.left=insert(keys);
            in.right=insert(keys);
            return in;
        } 
    }
     static void levelTraversal(node Node) 
    {
        Queue<node> q=new LinkedList<>();
        q.add(Node);
        q.add(null);
        while (!q.isEmpty()) {
            node cur=q.remove();
            if(cur==null)
            {
                System.out.println("");
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(cur.key+" ");
                if(cur.left!=null)
                {
                    q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
            } 
        }
    }
    
    static Boolean check(node root,node sub)
    {
        if(root==null && sub==null)
        {
            return true;
        }
        
        if(root.key!=sub.key)
        {
            return false;
        }
        check(root.left,sub.left);
        check(root.right,sub.left);
        return true;
    } 
    static Boolean st(node root,node sub)
     {
        if(sub==null)
        {return true;}
        if(root==null)
        {return false;}
        if(root.key==sub.key)
        {
            if(check(root, sub))
            {
                return true;
            }
        }
        st(root.left,sub);
        st(root.right,sub);  
        return false;
     }

    public static void main(String args[])
    {
        int[] keys={9,7,8,-1,-1,1,2,-1,-1,3,-1,-1,4,5,-1,-1,6,-1,-1};
        int[] sub={1,2,-1,-1,3,-1,-1};

        tree t=new tree();

        node root=t.insert(keys);

        levelTraversal(root);
        System.out.println("");

        i=-1;
        node subtree=t.insert(sub);
        levelTraversal(subtree);
        System.out.println("");

        System.out.println(st(root,subtree));


    }
    
}
