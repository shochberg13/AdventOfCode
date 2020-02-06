package AdventOfCode2016.problem02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem02a {
	private Scanner scanner;

	public Problem02a() throws FileNotFoundException {
		File file = new File(
				"C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\AoC2016_Problem02.txt");
		this.scanner = new Scanner(file);
	}

	public void runProgram() {

		List<String> input = getInput();
		String finalCode = "";
		int xCoord = 1;
		int yCoord = 1;
		for (String inputDirections : input) {
			for (int i = 0; i < inputDirections.length(); i++) {
				char direction = inputDirections.charAt(i);
				
				if (direction == 'U' && yCoord != 0) {
					yCoord--;
				}else if (direction == 'D' && yCoord != 2) {
					yCoord++;
				}else if (direction == 'L' && xCoord != 0) {
					xCoord--;
				}else if (direction == 'R' && xCoord != 2) {
					xCoord++;
				}
				System.out.println("(" + xCoord + ", " + yCoord + ")");
			}
			
			finalCode += Integer.toString(pressButton(xCoord, yCoord)) ;
			System.out.println("Final Code so far: " + finalCode);
		}
		System.out.println("The final code is: " + finalCode);
	}

	public ArrayList<String> getInput() {
		ArrayList<String> input = new ArrayList<String>();
		while (this.scanner.hasNextLine()) {
			input.add(this.scanner.nextLine());
		}
		return input;
	}

	public int pressButton(int x, int y) {

		if (x == 0 && y == 0) {
			return 1;
		} else if (x == 1 && y == 0) {
			return 2;
		}else if(x == 2 && y == 0){
			return 3;
		}else if(x == 0 && y == 1){
			return 4;
		}else if(x == 1 && y == 1){
			return 5;
		}else if(x == 2 && y == 1){
			return 6;
		}else if(x == 0 && y == 2){
			return 7;
		}else if(x == 1 && y == 2){
			return 8;
		}else if(x == 2 && y == 2){
			return 9;
		}
		
		return 0; // error
		
	}
}
