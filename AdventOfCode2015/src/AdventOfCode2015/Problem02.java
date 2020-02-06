package AdventOfCode2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File(
				"C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\AoC2015_Problem02.txt");
		Scanner scan = new Scanner(file);
		scan.useDelimiter("x");
		ArrayList<String> list = new ArrayList<String>();

		
		//HELP! How do I get just the numbers? 
		
		while (scan.hasNextLine()) {
			list.add(scan.next());
		}
		System.out.println(list);
		System.out.println("First: " + list.get(0));
		System.out.println("First: " + list.get(1));
		System.out.println("First: " + list.get(2));
		System.out.println("First: " + list.get(3));
	}
}