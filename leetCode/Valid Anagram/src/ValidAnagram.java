import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	
	
	public static boolean checkValidAnagram(String s,String t) {
		if(s.length()!=t.length())
		return false;
		
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<t.length();i++) {
			if(!map.containsKey(t.charAt(i)))
				map.put(t.charAt(i), 1);
			else map.put(t.charAt(i), map.get(t.charAt(i))+1);
		}
			
			for(int i=0;i<s.length();i++) {
				if(!map.containsKey(s.charAt(i))||(map.get(s.charAt(i))<=0)) {
					return false;	
				}
				else map.put(s.charAt(i), map.get(s.charAt(i))-1);
				
			}
				
				return true;
		}
		
	
	
	
	
	
	
	
public static void main(String []args){
		
		String s="anagram";
		String t="nagaram";
		
		System.out.println(checkValidAnagram(s,t));
		
		
		
		
	}

}
