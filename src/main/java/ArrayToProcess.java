package main.java;

/**
 * @author Ekemini Peace Udom
 *
 */
public class ArrayToProcess {
	private final String input;
	private final String output;
	
	public ArrayToProcess(String input)
	{
		this.input=input;
		RangeSummarizer range= new RangeSummarizer();
		output = range.summarizeNumberString(input);
	}

	public String getOutput() {
		return output;
	}
	

}
