import java.util.*;
import java.util.LinkedList;

// import org.w3c.dom.Node;
public class BinaryTree 
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

    static class tree
    {
        static int i=-1;
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

    static void preorder(node Node)
    {//Root Left Right
        if(Node==null)
        {
            return;
        }
        System.out.print(Node.key+" ");
        preorder(Node.left);
        preorder(Node.right);
    }

    static void inorder(node Node)
    {//Left Root Right
        if(Node==null)
        {
            return;
        }
        inorder(Node.left);
        System.out.print(Node.key+" ");
        inorder(Node.right);
    }


    static void postorder(node Node)
    {//Left Right Root
        if(Node==null)
        {
            return;
        }
        postorder(Node.left);
        postorder(Node.right);
        System.out.print(Node.key+" ");
    }


    static void levelTraversal(node Node) {
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
    
    static void zigzag(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int flag=1;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        while (!q.isEmpty()) 
        {
           node cur=q.remove();
           if(cur==null)
           {
            if(q.isEmpty())
            {
                break;
            }
            else
            {
                q.add(null);
                if(flag==1)
                {
                    flag=0;
                }
                else
                {
                    flag=1;
                }
            }//not done
           }
        } 
    }
    static int count(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftnode=count(root.left);
        int rightnode=count(root.right);
        return leftnode+rightnode+1;
    }

    static int sum(node root)
    {
       if(root==null)
       {
        return 0;
       }
       int leftsum=sum(root.left);
       int rigtsum=sum(root.right);
       return leftsum+rigtsum+root.key;
    }

    static int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        
        int hei=Math.max(leftheight, rightheight)+1;
        return hei; 
    }
    public static void main(String args[])
    {
       int[] keys={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //int[] keys={1,2,3,-1,-1,4,5,-1,-1,6,-1,-1,7,-1,-1};
       tree t=new tree();
       node root=t.insert(keys);

       System.out.println("Root="+root.key);

       System.out.println("prerder");
       preorder(root);
       System.out.println("");

       System.out.println("Inorder");
       inorder(root);
       System.out.println("");

       System.out.println("postorder");
       postorder(root);
       System.out.println("");

       System.out.print("no of nodes ="+count(root));
       System.out.println("");

       System.out.println("Level Order Traversal");
       levelTraversal(root);
       System.out.println("");

       System.out.println("Level Order Traversal");
       zigzag(root);
       System.out.println("");

       System.out.print("sum of nodes ="+sum(root));
       System.out.println("");

       System.out.print("height of tree ="+height(root));
       System.out.println("");
    }
    
}
