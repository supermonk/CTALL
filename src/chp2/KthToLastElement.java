/**
 * 
 */
package chp2;
/**
 * 	KthToLastElement.java
 *	Created on Jul 4, 2015, 5:41:58 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class KthToLastElement<T> {
	
	public LinkedListNode<T> findK(LinkedListNode<T> node, int k){
		
		int i=0;
		LinkedListNode<T> temp = node;
		while(temp!=null && i<k){
			temp = temp.next;
			i++;
		}
		if(temp==null){
			// there are no k elements
			return null;
		} 
		 
		return temp;
		
	}

}
