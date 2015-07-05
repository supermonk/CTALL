/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import chp2.KthToLastElement;
import chp2.LinkedListNode;
import chp2.LinkedListPalindrom;
import chp2.RemoveDuplicates;

/**
 * 	TestChp2.java
 *	Created on Jul 4, 2015, 5:03:44 PM with @version 1.0
 *	@author narendrabidari
 * 	Add description of file
 */
/**
 * @author narendrabidari
 *
 */
public class TestChp2 {

	LinkedListNode<Integer> node = null;
	LinkedListNode<Integer> duplicatenode = null;
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
		node = new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> temp1 = node;
		for(int i=1;i<10;i++){
			temp1.next = new LinkedListNode<Integer>(i);
			temp1 = temp1.next;
		}
		
		duplicatenode = new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> temp = duplicatenode;
		for(int i=1;i<10;i++){
			temp.next = new LinkedListNode<Integer>(0);
			temp = temp.next;
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void RemoveDUplictest() {
		
		RemoveDuplicates<Integer> dd = new RemoveDuplicates<>();
		assertEquals(null,dd.removeDuplicates(duplicatenode).next);
		 
	}
	
	@Test
	public void KthToLast() {
		
		KthToLastElement<Integer> dd = new KthToLastElement<>();
		assertEquals(null,dd.findK(node, 12));
		assertEquals(0,(int)dd.findK(node, 0).val);
		assertEquals(5,(int)dd.findK(node, 5).val);
		assertNotEquals(6,(int)dd.findK(node, 5).val);
		 
	}
	
	@Test
	public void LinkePalindrom() {
		
		LinkedListPalindrom<Integer> dd = new LinkedListPalindrom<>();
		assertFalse(dd.isPalindrome(node));
		assertTrue(dd.isPalindrome(duplicatenode));
		 
	}

	
}
