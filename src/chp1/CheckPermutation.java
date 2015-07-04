package chp1;

public class CheckPermutation {

	public static boolean Check(String p, String q){
		char[] flag = new char[128];
		if(p==null && q == null)
			return true;
		if(p==null || q == null)
			return false;
		if(p.length()!=q.length())
			return false;
		for(int i=0;i<p.length();i++){ 
			flag[(int)p.charAt(i)]+=1;
		}
		for(int i=0;i<q.length();i++){ 
			flag[(int)q.charAt(i)]-=1;
		}
		for(int i=0;i<flag.length;i++){ 
			if(flag[i]!=0)
				return false;
		}
		return true;
	}
}
