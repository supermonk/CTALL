/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import chp3.Queue;
import chp3.SortStack;
import chp3.Stack;

/**
 * 	TestChp3.java
 *	Created on Jul 4, 2015, 11:09:38 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class TestChp3 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=EmptyStackException.class)
	public void Exceptiontest() {
		Stack<Integer> st = new Stack<>(Integer.class,3);
		st.pop();
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void Exception2test() {
		Stack<Integer> st = new Stack<>(Integer.class,0);
		st.push(10);
	}
	
	@Test
	public void NormalStack() {
		Stack<Integer> st = new Stack<>(Integer.class,2);
		st.push(1);
		st.push(2);
		assertEquals(2, st.pop().intValue());
		assertEquals(1, st.pop().intValue());
	}
	
	/**
	 * Queue
	 * 
	 */
	

	@Test(expected=EmptyStackException.class)
	public void ExceptiontestQueue() {
		Queue<Integer> queue = new Queue<>(3);
		queue.pop();
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void Exception2testQueue() {
		Queue<Integer> queue = new Queue<>(0);
		queue.push(1);;
	}
	
	@Test
	public void NormalQueue() {
		Queue<Integer> queue = new Queue<>(2);
		queue.push(1);
		queue.push(2);
		assertEquals(1, queue.pop().intValue());
		assertEquals(2, queue.pop().intValue());
		
	}
	
	@Test
	public void Sort() {
		Stack<Integer> st = new Stack<>(Integer.class,10);
		for(int i=0;i<10;i++){
			st.push(i);
		}
		Stack<Integer> ret = SortStack.sortMe(st);
		assertEquals(0, ret.pop().intValue());
		assertEquals(1, ret.pop().intValue());
		assertEquals(2, ret.pop().intValue());
		
	}

}
