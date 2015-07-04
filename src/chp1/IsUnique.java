package chp1;

public class IsUnique {
	
	 public static boolean Unique(String st){
		 char[] flag = new char[128];
		 for(int i=0;i<st.length();i++){
			 if(flag[(int)st.charAt(i)]==1)
				 return false;
			 flag[(int)st.charAt(i)]+=1;
		 }
		 return true;
	 }
	

}
