/**
 * 
 */
package chp2;
/**
 * 	CircularArray.java
 *	Created on Jul 4, 2015, 10:29:00 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class CircularLinkedList<T extends Comparable<T>> {

	
	public LinkedListNode<T> findBegining(LinkedListNode<T> li){
		if(li==null)
			return null;
		LinkedListNode<T> slowpointer = li;
		LinkedListNode<T> fastpointer = li;
		LinkedListNode<T> inter = findIntersection(slowpointer,fastpointer); 
		// no intersection
		if(inter == null){
			return null;
		}
		
		return findMerge(inter,li);
	}
	
	private LinkedListNode<T> findIntersection(LinkedListNode<T> slow , LinkedListNode<T> fast){
		while(slow!=null && fast!=null){
			slow = slow.next;
			if(fast.next==null)
				return null;
			fast = fast.next.next;
			if(slow.val.compareTo(fast.val)==0){
				return slow;
			}
		}
		return null;
	}
	private LinkedListNode<T> findMerge(LinkedListNode<T> a , LinkedListNode<T> b ){
		while(a!=b){
			a = a.next;
			b = b.next;
		}
		return a;
	}
}
