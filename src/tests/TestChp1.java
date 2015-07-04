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

import chp1.CheckPermutation;
import chp1.IsUnique;
import chp1.OneWayEdit;
import chp1.PalindromPermutations;
import chp1.RotateMatrix;
import chp1.StringCompression;
import chp1.URLify;

/**
 * @author narendrabidari
 *
 */
public class TestChp1 {

	char[] charArrSt = new char[128]; 

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

		for(int i=0;i<128;i++){
			charArrSt[i]=(char)i; 
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void IsUniquetest() {
		assertTrue(IsUnique.Unique(new String(charArrSt)));
		assertFalse(IsUnique.Unique("abcdabcd"));
		assertTrue(IsUnique.Unique("12345"));
	}
	
	@Test
	public void CheckPermutation() {
		assertTrue(CheckPermutation.Check(null,null));
		assertFalse(CheckPermutation.Check(null,"a"));
		assertFalse(CheckPermutation.Check("b",null));
		assertFalse(CheckPermutation.Check("a","b"));
		assertFalse(CheckPermutation.Check("b","adfassdsafsdasfda"));
		assertTrue(CheckPermutation.Check(new String(charArrSt),new String(charArrSt)));
	}
	
	@Test
	public void URLFY() {
		 
		assertArrayEquals("Mr%20John%20Smith".toCharArray(), URLify.replace("Mr John Smith    ".toCharArray(),13));
	}
	
	@Test
	public void Palindrom() {
		 
		assertTrue(PalindromPermutations.isPalindromPermutations("Tact Coa"));
	}
	
	@Test
	public void OneEdit() {
		 
		assertTrue(OneWayEdit.isPermOne("abc", "ac"));
		assertTrue(OneWayEdit.isPermOne("abc", "abc"));
		assertTrue(OneWayEdit.isPermOne("", ""));
		assertFalse(OneWayEdit.isPermOne(null, ""));
		assertTrue(OneWayEdit.isPermOne(null, null));
	}
	
	@Test
	public void StringCompress() {
		 
		assertTrue("a1b1c1d1".equals(StringCompression.compress("abcd")));
		assertTrue("".equals(StringCompression.compress("")));
		assertTrue(" 1".equals(StringCompression.compress(" ")));
		assertTrue("a10".equals(StringCompression.compress("aaaaaaaaaa")));
	}
	
	@Test
	public void RotateMatrix() {
		int ret[][] = { {2,3},
						{1,4}};
		int inp [][] = {{1,2},
						{4,3}};
		assertArrayEquals(ret, RotateMatrix.rotateMatrix(inp));
	 
		 
	}
	
	@Test
	public void RotateMatrix2() {
		int ret[][]  = {
				{4,5,6,7},
				{3,14,15,8},
				{2,13,16,9},
				{1,12,11,10}
						};
		int inp [][] = {
				{1,2,3,4},
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7}
						};
		assertArrayEquals(ret, RotateMatrix.rotateMatrix(inp));
	 
		 
	}

}
