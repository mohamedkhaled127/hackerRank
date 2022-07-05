import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringSlidingWindow {
	
	
	
public static String minimumWindowSubstring(String s,String t){
	String minResult="";
	int count=0;
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	Map<Character,Integer>smap=new HashMap<Character,Integer>();
	
	for(int i=0;i<t.length();i++)
	{
		 if(!map.containsKey(t.charAt(i))) {
			 map.put(t.charAt(i), 1);
			} else {
			 map.put(t.charAt(i), map.get(t.charAt(i))+1);
			}
	}
	
	for(int i=0;i<t.length();i++)
	{
		 if(!smap.containsKey(t.charAt(i))) {
			 smap.put(t.charAt(i), 0);
			} 
			
	}
	
	
	
	int left=0;
	int current=0;
	while(current<s.length()) {
		if(!map.containsKey(s.charAt(current))) {
			current++;
			continue;
		}
		
		smap.put(s.charAt(current),smap.get(s.charAt(current))+1);
		if(smap.get(s.charAt(current))<=map.get(s.charAt(current))){
			count++;
			while(count==t.length()) {
				
				if(minResult=="" ||s.substring(left, current+1).length()<minResult.length())
					minResult=s.substring(left, current+1);
				
				
				if(!smap.containsKey(s.charAt(left))) 
				{
					left++;
					continue;
				}
				
				smap.put(s.charAt(left),smap.get(s.charAt(left))-1);
				
				
				if(smap.get(s.charAt(left))<map.get(s.charAt(left))){
					count--;
				}
				if(minResult=="" || s.substring(left, current+1).length()<minResult.length()) {
					minResult=t.substring(left,current+1);
				}
				
				
			left++;
			
			
		}
			
		
	}
		current++;
	}
	
	return minResult;
}
	
	
	
	
	
public static void main(String []args){
		
		String str="ADOBECODEBANC";
		String target="ABC";
		
		System.out.println(minimumWindowSubstring(str,target));
		
		
		
		
	}

}
