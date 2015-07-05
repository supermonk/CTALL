/**
 * 
 */
package chp2;
/**
 * 	RemoveDuplicates.java
 *	Created on Jul 4, 2015, 4:37:37 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class RemoveDuplicates<T> {
	
	// No buffer.
	
	public  LinkedListNode<T> removeDuplicates(LinkedListNode<T> node){
		if(node == null || node.next==null){
			return node;
		}
		//n2
		LinkedListNode<T> root = node;
		LinkedListNode<T> temp = root.next;
		while(root!=null){
			while(temp!=null && root!=null){
				if(root.val==temp.val){
					if(root.next!=null){
						root.val = root.next.val; 
						root.next = root.next.next;
						
					}else{
						root=null;
					}
					
				}
					temp=temp.next;
				
			}
			temp = root.next;
			root = root.next;
		}
		return node;
	}

}
