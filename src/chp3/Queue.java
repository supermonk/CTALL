/**
 * 
 */
package chp3;

import java.util.EmptyStackException;

/**
 * 	Queue.java
 *	Created on Jul 4, 2015, 11:20:44 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class Queue<T extends Comparable<T>> {

	QueueNode<T> front = null;
	QueueNode<T> back = null;
	int length = 0;
	int index = 0;
	public Queue(int len){
		this.length = len;
	}
	public void push(T val){
		if(index<length){
			if(front ==null){
				front = new QueueNode<T>(val);
				back = front;
			}else{
				front.next = new QueueNode<T>(val);
				front = front.next;
			}
			index++;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public T pop(){
		if(back==null || front == null){
			throw new EmptyStackException();
		}
		index--;
		QueueNode<T> temp = back;
		back = back.next;
		if(back==null){
			front =null;
		}
		return temp.val;
	}
	
	public T peek(){
		if(back==null || front == null){
			throw new EmptyStackException();
		} 
		return back.val;
	}
}

class QueueNode<T extends Comparable<T>>{
	T val;
	QueueNode<T> next =null;
	public QueueNode(T val){
		this.val = val;
		next = null;
	}
}
