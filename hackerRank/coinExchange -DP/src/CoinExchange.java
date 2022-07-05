import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinExchange {
	
	public static long coinExchange(int[] arr,int target,int current, Map<String,Long> memo)
	{
		if(memo.containsKey(target+":"+current))
			return memo.get(target+":"+current);
			
			
		if(target==0)
			return 1;
		
		if (target<0)
			return 0;
		
		if(target>0 && current>=arr.length)
			return 0;
		
		long count=0;

		count+=coinExchange(arr,target-arr[current],current,memo)+coinExchange(arr,target,current+1,memo);
		
		
		memo.put(target+":"+current, count);
		return count;
	}
	
	
	
	
	
	
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
	int target=sc.nextInt();
	int size=sc.nextInt();
	
	
	
	 int []arr=new int[size];
	 for(int i=0;i<size;i++)
		 arr[i]=sc.nextInt();
	 Map<String, Long> memo = new HashMap<>();
	 long x=coinExchange(arr,target,0,memo);
	  // System.out.println(x.get(0));
	   System.out.println(x);
	   
	}

}
