package AdventOfCode2019.Problem01;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> list = getFile();
		int fuelTotal = 0;
		
		for (int number : list) {
		
			int tempNumber = fuelRequired(number);
			fuelTotal += tempNumber;
			
			while(tempNumber > 6){
				tempNumber = fuelRequired(tempNumber);
				fuelTotal += tempNumber;
			}
		}
		
		System.out.println("Total Fuel Requirement: " + fuelTotal);

	}

	public static ArrayList<Integer> getFile() throws FileNotFoundException {
		File file = new File(
				"C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\AoC2015_Problem01.txt");
		Scanner scan = new Scanner(file);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (scan.hasNextLine()) {
			list.add(Integer.parseInt(scan.nextLine()));
		}
		return list;
	}
	
	public static int fuelRequired(int number){
		return (number / 3) - 2;
	}
}
