
public class LargestRectangleDivAndConq {
	
	public static int findMinIndex(int[]h,int l,int r) {
		int min=l;
		for(int i=l;i<=r;i++) {
			
			if(h[i]<h[min])
				min=i;
		}
		return min;
	}
	
	
	public static int largestRectangle(int[]h,int l,int r) {
		
	    if(l==r)
			return h[l];
		if(l>r)
			return 0;
		
		
		int minIndex=findMinIndex(h,l,r);
		return Math.max(h[minIndex]*(r-l+1), Math.max(largestRectangle(h,l,minIndex-1),largestRectangle(h,minIndex+1,r)));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String []args){
	
	
	int[]h= {5, 4 ,10 ,1 ,6 ,9 ,2, 4};
	int n=8;
	System.out.println(largestRectangle(h,0,n-1));

}
}