import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestDistanceBFS {
	
	
	public static int [] findPath(int n, int [][]edges,int source)
	{
		
		int[]visited=new int[n];
		Arrays.fill(visited, 0);
		int []distance=new int[n];
		int ref=0;
		Arrays.fill(distance, -1);
		distance[source]=0;
		
		
		 Queue<Integer> queue= new LinkedList<>();
		 queue.add(source);
		do {
		 
		int value=queue.remove();
		
		if(visited[value]==1)
		{
			
		continue;
		
		}
		
		else
		{  
			for(int i=0;i<edges.length;i++)
			{
		 if(edges[i][0]==value )
		 {
			 queue.add(edges[i][1]);
			 
			 if(distance[edges[i][1]]==-1)
				
			 distance[edges[i][1]]=distance[value]+6;
				 
			
		 }
		 
		 else if(edges[i][1]==value )
		 {
			 queue.add(edges[i][0]);
			 
			 if(distance[edges[i][0]]==-1)
				
			 distance[edges[i][0]]=distance[value]+6;
			
			
		 }
			 
			}
			visited[value]=1;
			
			
			
			
			
			
			
		}
		
		
		}
		while(!queue.isEmpty());
	
		
		
		return distance;
	}
	
	
	public static void main(String []args){
		
		//int n=3;
		//int m=1;
		//int [][]edges= {{1,2}};
		//int source=1;
		
		
		//int[] distance=findPath(n,edges,source);
		
	Scanner sc=new Scanner(System.in);
	int queries=sc.nextInt();
	for(int q=0;q<queries;q++)
	{
	int n=sc.nextInt();
	int m=sc.nextInt();
	int [][]edges=new int[m][2];
	for(int i=0;i<m;i++)
	{
		edges[i][0]=sc.nextInt()-1;
		edges[i][1]=sc.nextInt()-1;
	}
	int source=sc.nextInt()-1;
	int[] distance=findPath(n,edges,source);
	
		
		for(int i=0;i<distance.length;i++)
			if(i==source)
				continue;
			else System.out.print(distance[i]+" ");
		
	}
	
	}

}
