package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class DataVisualizer {
	public static int commaCount(String str) {
		int count = str.split(",").length - 1;
		return count;
		
	}
	
	public static boolean containsInt(String str) {
		boolean isNum = false;
			if (str!= null && !str.isEmpty()) {
				for (char ch: str.toCharArray()) {
					if (isNum = Character.isDigit(ch)) {
						break;
					}
				}
			}
			
		return isNum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.) Prompt the user for a title for data. Output the title
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a title for the data:");
		String dataTitle = sc.nextLine();
		
		// 2.) Prompt the user for the headers of two columns of a table. Output the column headers.
		
		System.out.println("Enter the column 1 header:");
		String columnOne = sc.nextLine();
		
		System.out.println("Enter the column 2 header:");
		String columnTwo = sc.nextLine();
		int quit = 0;
		
	/*
	 * Prompt the user for data points. Data points must be in this format: string, int. 
	 * Store the information before the comma into a string variable and the information after the comma into an integer. 
	 * The user will enter -1 when they have finished entering data points. Output the data points. 
	 * Store the string components of the data points in an ArrayList of strings. 
	 * Store the integer components of the data points in a second ArrayList of integers.
	 
	 * */
		ArrayList<String> strData = new ArrayList<>();
		ArrayList<String> intData = new ArrayList<>();
		while (quit != -1) {
			System.out.println("Enter a data point (-1 to stop input):");
			String dataPoint = sc.nextLine();
			if (dataPoint.equals("-1")) {
				quit = -1;
			} else if (commaCount(dataPoint)!=1) {
				System.out.println("Error: Too many commas in input.");
			} else if (!containsInt(dataPoint)) {
				System.out.println("Error: Comma not followed by an integer.");
			} else {
				String tok[] = dataPoint.replace(" ", "").split(",");
				strData.add(tok[0]);
				intData.add(tok[1]);
				System.out.println("Data string: " + tok[0] );
				System.out.println("Data integer: " +  tok[1].trim());
			}
		}
		

			
			
		System.out.printf("        %s",dataTitle);
		System.out.printf("%s         |       %s\n",columnOne,columnTwo);
		System.out.println("--------------------------------------------");
 
		System.out.println(strData);
		System.out.println(intData);
	}

}
