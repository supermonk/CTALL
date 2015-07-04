package chp1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class PalindromPermutations {
	
	// Fuck Space and dummy characters
	// is it permutaion of palindorme
	// check if we can make a palindrome.
	public static boolean isPalindromPermutations(String st){
		if(st ==null || st.isEmpty() || st.length()==1)
			return true;
		st = st.toLowerCase();
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<st.length();i++){
			if(escape(st.charAt(i))){
				continue;
			}
			if(map.containsKey(st.charAt(i))){
				map.put(st.charAt(i), map.get(st.charAt(i))+1);
			}else{
				map.put(st.charAt(i), 1);
			}
		}
		boolean flag = false;
		Iterator<Entry<Character,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<Character,Integer> et = it.next();
			if(et.getValue()%2==1 && flag){
				return false;
			}
			if(et.getValue()%2==1){
				flag = false;
			}
		}
		return true;
	}
	
	private static boolean escape(char c){
		int k = (int)c;
		if(k>=97 && k<=122){
			return false;
		}
		return true;
	}

}
