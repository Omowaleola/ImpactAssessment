package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import numberrangesummarizer.NumberRangeSummarizer;

/**
 * @author Ekemini Peace Udom
 *
 */
public class RangeSummarizer implements NumberRangeSummarizer {

	/**
	 * Method that converts comma delimited input to a collection of integers
	 */
	@Override
	public Collection<Integer> collect(String input) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		String[] numbers = input.split(",");
		
		for (String x : numbers)
		{
			if(isNumeric(x))
			{
				array.add(Integer.parseInt(x));
			}else
			{
				System.err.println("Invalid Number");
			}
		}
		
		return array;
	}

	/**
	 * Method that takes in a collection of integers as input and returns a summarized string
	 */
	@Override
	public String summarizeCollection(Collection<Integer> input) {

		ArrayList<Integer> array = new ArrayList<>(input);
		
		Collections.sort(array);
		ArrayList<ArrayList<Integer>> inputArray = new ArrayList<>();
		ArrayList<Integer> tmp = new ArrayList<>();
		tmp.add(array.get(0));
		
		for( int i=0;i<array.size()-1;i++)
		{
			if(array.get(i+1)==array.get(i)+1)
			{
				tmp.add(array.get(i+1));
			}else
			{
				inputArray.add(tmp);
				 tmp = new ArrayList<>();
				 tmp.add(array.get(i+1));
			}
		}
		
		inputArray.add(tmp);
		String output="";
		Iterator<ArrayList<Integer>> iterator = inputArray.iterator();
		while (iterator.hasNext())
		{
			ArrayList<Integer> temp =iterator.next();
			
			if(!iterator.hasNext())
			{
				output+= summarizedNumbers(temp);
			}else {
				output+= summarizedNumbers(temp) + ", ";
			}
			
		}
		
		
		return output;
	}
	
	/**
	 * @param array An ArrayList of Numbers
	 * @return The summarized form of the array of numbers 
	 */
	public String summarizedNumbers(ArrayList<Integer> array)
	{
		String msg ="";
		
		if(array.size()==1)
		{
			msg= String.valueOf(array.get(0));
		}else if (array.size()>1)
		{
			msg= minNumberInArray(array) + "-"+ maxNumberInArray(array);
		}
		
		return msg;
	}
	/**
	 * @param str Takes in a string 
	 * @return Whether the string is a number of type integer
	 */
	public static boolean isNumeric(String str) {
	    if (str == null) {
	        return false;
	    }
	    try {
	        int d = Integer.parseInt(str);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	/**
	 * @param numbers Collection of Numbers
	 * @return The maximum number in the array
	 */
	public int maxNumberInArray(Collection<Integer> numbers)
	{
		ArrayList<Integer> array = new ArrayList<>(numbers);
		
		int max=array.get(0);
		
		for (int x =0; x<array.size();x++ )
		{
			if(max<array.get(x))
			{
				max=array.get(x);
			}
		}
		
		return max;
	}
	/**
	 * @param numbers Collection of Numbers
	 * @return The minimum number in the array
	 */
	public int minNumberInArray(Collection<Integer> numbers)
	{
		
		ArrayList<Integer> array = new ArrayList<>(numbers);
		
		int min=array.get(0);
		
		for (int x =0; x<array.size();x++ )
		{
			if(min>array.get(x))
			{
				min=array.get(x);
			}
		}
		
		
		return min;
	}
	
	/**
	 * @param input String input
	 * @return Number summarized version of input string
	 * Method chaining
	 */
	public String summarizeNumberString(String input)
	{
		return summarizeCollection(collect(input));
	}


}
