/**
 * 
 */
package chp3;
/**
 * 	StackFromQueue.java
 *	Created on Jul 5, 2015, 12:48:08 AM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class StackFromQueue<T extends Comparable<T>> {
	
	Queue<T> que1 = null;
	Queue<T> que2 = null;
	
	public StackFromQueue(int len){
		que1 = new Queue<>(len);
		que2 = new Queue<>(len);
	}
	
	public void push(T val){
		que1.push(val);
	}
	
	public T pop(){
		if(que2.length==0){
			while(que1.back!=null){
				que2.push(que1.pop());
			}
		}
		return que2.pop();
	}
	
	

}
