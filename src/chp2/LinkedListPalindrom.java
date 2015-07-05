/**
 * 
 */
package chp2;
/**
 * 	LinkedList.java
 *	Created on Jul 4, 2015, 7:19:37 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class LinkedListPalindrom<T extends Comparable<T>> {
	
	public boolean isPalindrome(LinkedListNode<T> node){
		if(node==null || node.next==null)
			return true;
		LinkedListNode<T> slow=node,fast=node.next;
		while(fast!=null){
			slow = slow.next;
			if(fast.next!=null){
				fast = fast.next.next;
			}else{
				fast = fast.next;
			}
		}
		LinkedListNode<T>ret = reverse(slow.next);
		while(node!=null && ret!=null){
			if(node.val.compareTo(ret.val)!=0){
				return false;
			}
			node = node.next;
			ret = ret.next;
		}
		return true;
	}
	
	public LinkedListNode<T> reverse(LinkedListNode<T> node){
		if(node == null || node.next==null){
			return node;
		}
		LinkedListNode<T> rever = null;
		LinkedListNode<T> temp = null;
		while(node!=null){
			temp= node.next;
			node.next = rever;
			rever = node;
			node = temp;
		}
		return rever;
	}

}
