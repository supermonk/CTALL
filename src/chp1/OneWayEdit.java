package chp1;

public class OneWayEdit {
	
	
	
	public static boolean isPermOne(String p, String q){
		if(p==null && q==null){
			return true;
		}
		if(p==null || q==null){
			return false;
		}
		
		if(Math.abs(p.length()-q.length())>1){
			return false;
		}
		int i=0,j=0,count=0;
		
		
		return match(i,j,count,p,q);
		
	}
	private static boolean match(int i, int j, int count,String p,String q){
		while(i<p.length()&& j<q.length()){
			if(p.charAt(i)==q.charAt(j)){
				i++;j++;
			}else{
				if(count==1){
					return false;
				}
				count++;
				return match(i,j+1,count,p,q) || match(i+1,j,count,p,q);
			}
		}
		if((i!=p.length()|| j!=q.length()) && count==1){
			return false;
		}
		return true;
	}

}
