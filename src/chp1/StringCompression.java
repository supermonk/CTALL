package chp1;

public class StringCompression {
	
	public static String compress(String st){
		if(st==null || st.isEmpty())
			return st;
		
		StringBuilder sb = new StringBuilder();
		int count=1;
		char c = st.charAt(0);
		for(int i=1;i<st.length();i++){
			if(c==st.charAt(i)){
				count++;
			}else{
				sb.append(c);
				sb.append(count);
				c= st.charAt(i);
				count=1;
			}
		}
		sb.append(c);
		sb.append(count);
		String d = sb.toString(); // debugging purposes
		return d;
	}
	

}
