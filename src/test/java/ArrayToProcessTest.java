package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.ArrayToProcess;

public class ArrayToProcessTest {
	ArrayToProcess range;
	String input, output;

	@Before
	public void setUp() throws Exception {
		
		input="1,3,6,7,8";
		output="1, 3, 6-8";
		range= new ArrayToProcess(input);
	}



	@Test
	public final void testGetOutput() {
		assertEquals(output, range.getOutput()); // TODO
	}

}
