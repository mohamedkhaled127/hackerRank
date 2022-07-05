
public class MinimumWindowSubstringBruteForce {
	
	
	
	public static boolean checkOccurance(String ss,String tt) {
		int sslength=ss.length();
		
		StringBuilder t = new StringBuilder(tt);
		
		for(int i=0;i<sslength;i++)
		{
			for(int j=0;j<t.length();j++)
			{
				
				if(ss.charAt(i)==t.charAt(j)) {
					t.deleteCharAt(j);
					
					System.out.println(t.toString());
					break;
				}
					
					
				
			}
		
	}
		if(t.length()==0)
			return true;
		return false;
	}
	
	public static String minimumWindowSubstring(String s,String t){
		String result ="";
		
		for(int i=0;i<s.length();i++) {
			
			String ss="";
			
			for(int j=i;j<s.length();j++) {
				
				ss+=s.charAt(j);
				if(ss.length()>=t.length() && checkOccurance(ss,t))
				{
					if(result=="" ||result.length()>ss.length()) {
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
