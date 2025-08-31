import java.util.Stack;

public class BinaryTreeItrativeTraversal 
{
    static class node 
    {
        int data;
        node left;
        node right;
         node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class  insert
    {
        static int i=-1;
        static node banao(int[] a)
        {
            i++;
            if(a[i]==-1)
            {
                return null;
            }
            node t=new node(a[i]);
            t.left=banao(a);
            t.right=banao(a);
            return t;
        }
    }
    static void preorder(node root)
    {//Root Left Right
        if(root==null)
        {
            return;
        }
        Stack<node> s=new Stack<>();
        s.push(root);
        while (!s.isEmpty()) 
        {
            node cur=s.pop();
            
            System.out.print(cur.data+" ");
            if(cur.right!=null)
            {s.push(cur.right);}
            if(cur.left!=null)
            {s.push(cur.left);} 
        }
    }
    static void Inorder(node root)
    {//Left Root Right
        if(root==null)
        {
            return; 
        }
       Stack<node> s=new Stack<>();
       s.push(root);
       node Node=root.left;
       while(!s.isEmpty())
       {
        if(Node!=null)
        {
            s.push(Node);
            Node=Node.left; 
        }
        else
        {
            node cur=s.pop();
            System.out.print(cur.data+" ");
            Node=cur.right;
        }
       }
    }
   
    static void postorder(node root)
    {

    }
   public static void main(String args[])
   {
    int[] keys={1,2,4,-1,-1,5,6,-1,-1,7,-1,-1,3,-1,-1};
    insert t=new insert();
    node root=t.banao(keys);
    preorder(root);
    System.out.println("");
    Inorder(root);
    System.out.println("");

    postorder(root);
    System.out.println("");
   } 
}
