package AdventOfCode2019.Problem02;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Integer> getOriginalNumberList() throws FileNotFoundException{
		File file = new File("C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\AoC2019_Problem02.txt");
		Scanner reader = new Scanner(file);
		String inputFile = reader.nextLine();
		List<String> stringList = Arrays.asList(inputFile.split(",")); 
		
		ArrayList<Integer> numberList = new ArrayList<>();
		for (String number : stringList){
			numberList.add(Integer.parseInt(number));
		}
		return numberList;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// Part 1
//		ArrayList<Integer> numberList = new ArrayList<Integer>();
//		numberList = getOriginalNumberList();
//		Problem02Helper answer = new Problem02Helper(numberList);
//		
//		System.out.println("Program before: " + answer.getNumberList());
//		numberList.set(1, 12); // Directions from AoC
//		numberList.set(2, 2); // Directions from AoC
//		
//		answer.runProgram();
//		System.out.println("Program after: " + answer.getNumberList());
//		System.out.println("The new number in position 0 is " + answer.getNumberList().get(0));
		
		// Part 2
		int noun = 0;
		int verb = 0;

		outerloop:
		for (int i = 0; i <= 99; i++){
			for (int j = 0; j <= 99; j++){
				ArrayList<Integer> numberList = new ArrayList<Integer>();
				numberList = getOriginalNumberList();
				Helper longList = new Helper(numberList);
				
				
				longList.setNumberList(1, i);
				longList.setNumberList(2, j);
				longList.runProgram();
				
				
				if (longList.getNumberList().get(0) == 19690720){
					noun = longList.getNumberList().get(1);
					verb = longList.getNumberList().get(2);
					System.out.println("The winning list: " + longList.getNumberList());
					System.out.println("The 'noun' is " + noun + " and the verb is " + verb + ". The answer is " + ((100 *noun) + verb  ));

					break outerloop;
				}
			}
		}
		

		

	}
}
