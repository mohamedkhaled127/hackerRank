import java.util.HashMap;
import java.util.Map;

public class MinimumWIndowSubstringBruteForceModified {
	
	public static boolean checkOccurance(String ss,String tt) {
	
		Map<Character,Integer>s=new HashMap<Character,Integer>();
		Map<Character,Integer>t=new HashMap<Character,Integer>();
		
		for(int i=0;i<tt.length();i++) {
			
		}
		
		
		
		
		for(int i=0;i<tt.length();i++)
		{
			 if(!t.containsKey(tt.charAt(i))) {
				 t.put(tt.charAt(i), 1);
				} else {
				 t.put(tt.charAt(i), t.get(tt.charAt(i))+1);
				}
		}
		for(int i=0;i<ss.length();i++) {
			if(!t.containsKey(ss.charAt(i)))
				continue;
			
			if(!s.containsKey(ss.charAt(i))) {
				 s.put(ss.charAt(i), 1);
				} else {
				 s.put(ss.charAt(i), s.get(ss.charAt(i))+1);
				}
			
			
		}
		
		for(int i=0;i<tt.length();i++) {
			
			int tv=t.get(tt.charAt(i));
			if(s.get(tt.charAt(i))==null ||(int)s.get(tt.charAt(i))<tv)
				return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	public static String minimumWindowSubstring(String s,String t){
		String result =null;
		
		for(int i=0;i<s.length();i++) {
			
			String ss="";
			
			for(int j=i;j<s.length();j++) {
				
				ss+=s.charAt(j);
				if(ss.length()>=t.length() && checkOccurance(ss,t))
				{
					if(result==null ||result.length()>ss.length()) {
						result=ss;
						break;
					}
				}
			
				
					
			}
		}
		
		
return result;
	}
	
	
	
	
	public static void main(String []args){
		
		String str="ADOBECODEBANC";
		String target="ABC";
		
		System.out.println(minimumWindowSubstring(str,target));
		
		
		
		
	}

}
