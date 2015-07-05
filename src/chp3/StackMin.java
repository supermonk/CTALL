/**
 * 
 */
package chp3;
/**
 * 	StackMin.java
 *	Created on Jul 4, 2015, 11:49:39 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class StackMin<T extends Comparable<T>> {


	// find min iin O(1)
	Stack<T> st = null;
	Stack<T> min = null;


	public StackMin(int len){

		st = new Stack(Integer.class, len);
		min = new Stack(Integer.class, len);
	}

	public void push(T val){
		st.push(val);
		if(min.index==0){
			min.push(val);
		}else{
			if(min.peek().compareTo(val)>=0){
				min.push(val);
			}
		}
	}

	public T pop(){

		if(st.peek().compareTo(min.peek())==0){
			min.pop();
		}
		return st.pop();
	}
	public T min(){
		return min.peek();
	}

}
