/**
 * 
 */
package chp3;
/**
 * 	SortStack.java
 *	Created on Jul 5, 2015, 1:23:50 AM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class SortStack<T extends Comparable<T>> {
	
	
	public static Stack<Integer> sortMe(Stack<Integer> st){
		if(st == null || st.index==1)
			return st;
		
		Stack<Integer> temp = new Stack<>(Integer.class, st.len);
		
		while(st.index!=0){
			int top = st.pop();
			if(temp.index==0 || top<=temp.peek()){
				temp.push(top);
			}else{
				while(temp.index!=0 && top>temp.peek()){
					st.push(temp.pop());
				}
				temp.push(top);
				
			}
			
		}
		return temp;
		 
	}

}
