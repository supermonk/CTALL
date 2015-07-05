/**
 * 
 */
package chp2;
/**
 * 	LinkedListNode.java
 *	Created on Jul 4, 2015, 4:38:24 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class LinkedListNode<T> {
	
	public LinkedListNode<T> next;
	
	public T val;
	public LinkedListNode(T val){
		this.val = val;
		this.next = null;
	}

}
