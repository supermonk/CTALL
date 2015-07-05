/**
 * 
 */
package chp2;
/**
 * 	DeleteMiddle.java
 *	Created on Jul 4, 2015, 6:00:05 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class DeleteMiddle<T> {


	public void delte(LinkedListNode<T> node){
		if(node.next==null);
		node =null;
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public void deleteMiddle(LinkedListNode<T> node){
		LinkedListNode<T> temp = node;
		LinkedListNode<T> temp1 = node.next;
		while(temp1!=null){

			if(temp1.next==null){
				break;
			}
			temp = temp.next;
			temp1=temp1.next.next;

		}
		temp.val = temp.next.val;
		if(temp.next!=null){ 
			temp.next = temp.next.next;
		}
	}

}
