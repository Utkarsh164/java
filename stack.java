import java.util.*;
public class stack 
{
    static void order(int data,Stack<Integer> s)
    {
        if(s.empty())
        {
            s.push(data);
            return;
        }
        int value=s.pop();
        order(data, s);
        s.push(value);
    }


    static void reverse(Stack<Integer> s)
    {
        if(s.empty())
        {
            return;
        }
        int p=s.pop();
        reverse(s);
        order(p, s);
        
        
    }
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());


         s.push(3);
         System.out.println(s);
        //Stack related questions 
        //1)enter 4 in stack(1,2,3) such tha order becomes 4,1,2,3
        //2)reverse the stack
        order(4,s);
        System.out.println(s);
        
        reverse(s); 
        System.out.println(s); 

    }
    
}
