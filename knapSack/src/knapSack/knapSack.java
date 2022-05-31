package knapSack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class knapSack {
    static Map<Integer, Integer> map = new HashMap<>();
    
    public static int knapSack(int target,int[]arr)
    {
        if(map.containsKey(target))
            return map.get(target);
        
        if(target==0)
            return 0;
        
        if(target<0)
            return -1;
        
        //int count=0;
        int max=-100;
        
        for(int i:arr)
        {
            int count=0;
            
            int rem=target-i;
        
            int res=knapSack(rem,arr);
            
            if(res>=0)
            {
                int sum=0;
                sum+=res;
                sum+=i;
                count=sum;
                
                
            }
            if(max<count ||max==-100)
                max=count;
        
            
            
        }
        map.put(target, max);
        
        
        
        return max;
    }
    
    
    
    
    
    
       public static void main(String []args){

            
           int queries;  
           Scanner sc=new Scanner(System.in);  
           queries=sc.nextInt();
           int[]k=new int[queries];
           for(int i=0;i<queries;i++)
           {
               int size=sc.nextInt();
               int target=sc.nextInt();
               int[]x=new int[size];
               for(int j=0;j<x.length;j++)
               {
                   x[j]=sc.nextInt();
               }
               
               k[i]=knapSack(target, x);
               
           }
           for(int i:k)
           System.out.println(i);

}
}
       
