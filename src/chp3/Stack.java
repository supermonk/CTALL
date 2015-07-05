/**
 * 
 */
package chp3;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * 	Stack.java
 *	Created on Jul 4, 2015, 11:03:23 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class Stack<T extends Comparable<T>> {

	int len = 0;
	int index =0;
	T[] arr ;
	/***
	 * http://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java?lq=1
	 * @param c
	 * @param len
	 */
	public Stack(Class<T> c , int len){
		this.len = len;
		@SuppressWarnings("unchecked")
		final T[] a = (T[]) Array.newInstance(c, len);
		this.arr = a;
	}

	public void push(T val){
		if(index<len){
			arr[index]=val;
			index++;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public T pop(){
		if(index==0){
			throw new EmptyStackException();
		}else{
			return arr[--index];
		}
	}
	public T peek(){
		if(index==0){
			throw new EmptyStackException();
		}else{
			return arr[index-1];
		}
	}

}
