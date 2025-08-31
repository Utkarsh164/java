public class LinkedList 
{
    static node head;
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void add(int value)
    {
        node box=new node(value);
        if(head==null)
        {
            head=box;
            return;
        }
        node cur=head;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
       
        cur.next=box;
    }
    public static void Print()
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        
        LinkedList list=new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Print();
    }
    
}