/**
 * 
 */
package chp2;
/**
 * 	Partition.java
 *	Created on Jul 4, 2015, 6:49:52 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class Partition<T extends Comparable<T>> {
	
	public void part(LinkedListNode<T> node, T val){
		if(node==null)
			return ;
		LinkedListNode<T> less = null;
		LinkedListNode<T> ret = less;
		LinkedListNode<T> more = null;
		LinkedListNode<T> temp = more;
		while(node!=null){
			if(val.compareTo(node.val)>=0){
				if(more == null){
					more = new LinkedListNode<T>(node.val); 
				}else{
					more.next = new LinkedListNode<T>(node.val);
					more = more.next;
				}
			}else{
				if(less == null){
					less = new LinkedListNode<T>(node.val); 
				}else{
					less.next = new LinkedListNode<T>(node.val);
					less = less.next;
				}
				
			}
		}
		less.next=temp;
		
	}

}
