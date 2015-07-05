/**
 * 
 */
package chp2;
/**
 * 	LinkedListIntersection.java
 *	Created on Jul 4, 2015, 7:58:26 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class LinkedListIntersection<T extends Comparable<T>> {
	
	public LinkedListNode<T> isIntersect(LinkedListNode<T> p , LinkedListNode<T> q){
		DumRsul<T> len1 = findLen(p);
		DumRsul<T> len2 = findLen(q);
		if(len1.length==0 || len2.length==0){
			return null;
		}
		if(len1.node.val.compareTo(len2.node.val)!=0){
			return null;
		}
		if(len1.length>len2.length){
			int delta = len1.length - len2.length;
			while(delta>0){
				p = p.next;
				delta--;
			}
		}else{
			int delta = len2.length - len1.length;
			while(delta>0){
				q = q.next;
				delta--;
			}
			
		}
		
		while(p.val.compareTo(q.val)!=0){
			p=p.next;
			q=q.next;
		}
		return p;
	}
	
	public DumRsul<T> findLen(LinkedListNode<T> node){
		int len = 0;
		LinkedListNode<T> ret = node;
		while(node!=null){
			ret = node;
			node = node.next;
			len++;
		}
		return new DumRsul<>(ret, len);
	}

}
class DumRsul<T extends Comparable<T>>{
	LinkedListNode<T> node;
	int length =0 ;
	public DumRsul(LinkedListNode<T> node, int length) {
		super();
		this.node = node;
		this.length = length;
	}
	
}
