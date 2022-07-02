import java.util.Scanner;

public class LargestRectangleBruteForce {

	int max=-1;
	public static int largestRectangle(int[]h,int n) {
		int max=-1;
		for(int i=0;i<n;i++)
		{
			int counter=0;
		
			for(int j=i;j>=0;j--)
			{
				if(h[j]>=h[i])
					counter++;
				else break;
				
			}
			for(int j=i+1;j<n;j++)
			{
				if(h[j]>=h[i])
					counter++;
				else break;
			}
			
			max=Math.max(max, counter*h[i]);

		}
		return max;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String []args){
		
		/*int[]h= {1,2,3,4,5};
		int n=5;
		System.out.println(largestRectangle(h,n));*/
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []h=new int[n];
		 for(int i=0;i<n;i++)
			 h[i]=sc.nextInt();
		 
		 System.out.println(largestRectangle(h,n));
	
		
	}
}
