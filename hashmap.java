import java.util.*;
public class hashmap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
          


        //insertion
        System.out.print("Size=");
        int n=sc.nextInt();
        String s;
        int a;
        for(int i=0;i<n;i++)
        {
            System.out.print("Country=");
            s=sc.next();
            System.out.print("count=");
            a=sc.nextInt();
            map.put(s,a);
        }
        System.out.println(map);
  


        //update
        map.put("PAK",0);
        System.out.println(map);


        //search
        if(map.containsKey("IND")==true)
        {
            System.out.println("contains");
        }

        System.out.println(map.get("IND"));
        System.out.println(map.get("INDO"));



        //ITRATION
         for(Map.Entry<String,Integer> i: map.entrySet())
         {
            System.out.print(i.getKey()+"=");
            System.out.println(i.getValue());
         }
         System.out.println(map.values());
        System.out.println(map.keySet());
         sc.close();

    }
    
}
