import java.util.Scanner;
public class Bitwise 
{
    public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    System.out.println("What to do:");
    System.out.println("1 on");
    System.out.println("2 off");
    System.out.println("3 toggle");
    System.out.println("4 check");
    System.out.print("choice:");
    int n=sc.nextInt();
    System.out.print("a:");
    int a=sc.nextInt();
    System.out.print("i:");
    int i=sc.nextInt();
    if(n==1)
    {
        
    int m=1<<i;
    System.out.print(a|m);
    }
    else if(n==2)
    {
        int m=~(1<<i);
        System.out.print(a&m);
    }
    else if(n==3)
    {
        //0 ka 1 and 1 ka 0
        int m=1<<i;
        System.out.print(a^m);
    }
    else if(n==4)
    {
        int m=1<<i;
        if((m & a)==0)
        {
            System.out.print("off");
        }
        else 
        System.out.print("on");
    }
    else 
    System.out.print("Wrong choise");
   }
}
