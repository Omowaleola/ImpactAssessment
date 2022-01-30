/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.RangeSummarizer;

/**
 *  @author Ekemini Peace Udom
 * 
 *
 */
public class RangeSummarizerTest {
	RangeSummarizer range;
	String input, output, rangeStr;
	Collection<Integer> in, out,minput;
	ArrayList<Integer> sArray;
	

	/**
	 * @throws java.lang.Exception
	 */
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		range= new RangeSummarizer();
		input="1,3,6,7,8";
		output="1, 3, 6-8";
		rangeStr="6-8";
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#collect(java.lang.String)}.
	 */
	@Test
	public final void testCollect() {
		out= new ArrayList<Integer>();
		out.add(1);
		out.add(3);
		out.add(6);
		out.add(7);
		out.add(8);
		assertEquals(out, range.collect(input)); // TODO
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#summarizeCollection(java.util.Collection)}.
	 */
	@Test
	public final void testSummarizeCollection() {
		in = new ArrayList<Integer>();
		in.add(1);
		in.add(3);
		in.add(6);
		in.add(7);
		in.add(8); 
		assertEquals(output, range.summarizeCollection(in));
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#summarizedNumbers(java.util.ArrayList)}.
	 */
	@Test
	public final void testSummarizedNumbers() {
		sArray = new ArrayList<Integer>();
		sArray.add(6);
		sArray.add(7);
		sArray.add(8); 
		assertEquals(rangeStr, range.summarizedNumbers(sArray));// TODO
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#isNumeric(java.lang.String)}.
	 */
	@Test
	public final void testIsNumeric() {
		assertTrue(range.isNumeric("1"));// TODO
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#maxNumberInArray(java.util.Collection)}.
	 */
	@Test
	public final void testMaxNumberInArray() {
		minput= new ArrayList<Integer>();
		minput.add(6);
		minput.add(7);
		minput.add(8);
		assertEquals(8, range.maxNumberInArray(minput));
		// TODO
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#minNumberInArray(java.util.Collection)}.
	 */
	@Test
	public final void testMinNumberInArray() {
		minput= new ArrayList<Integer>();
		minput.add(6);
		minput.add(7);
		minput.add(8);
		assertEquals(6, range.minNumberInArray(minput));
	}

	/**
	 * Test method for {@link main.java.RangeSummarizer#summarizeNumberString(java.lang.String)}.
	 */
	@Test
	public final void testSummarizeNumberString() {
		assertEquals(output, range.summarizeNumberString(input));// TODO
	}

}
