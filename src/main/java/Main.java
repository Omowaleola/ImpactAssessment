package main.java;

import java.util.Scanner;

/**
 * @author Ekemini Peace Udom
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String tester = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
	//	ArrayToProcess temp = new ArrayToProcess(tester);
		System.out.println("Enter a series of numbers separated by a comma");
		Scanner scanner = new Scanner(System.in);
		String tester = scanner.nextLine();
		
		ArrayToProcess temp = new ArrayToProcess(tester);		
		System.out.println(temp.getOutput());
	}

}
