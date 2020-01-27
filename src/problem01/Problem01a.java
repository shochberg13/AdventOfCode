package problem01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem01a {
	private int x;
	private int y;
	private ArrayList<MyCoord> coordList;
	
	public Problem01a() {
		this.x = 0;
		this.y = 0;
		this.coordList = new ArrayList<MyCoord>();
	}

	public void problemStart() throws FileNotFoundException{
		ArrayList<String> inputList = this.fileToList();
		String directionLooking = "north";
		System.out.println("My first location is : (" + this.x + ", " + this.y + ")");
		for(String instruction : inputList){
			if ((instruction.charAt(0) == 'R' && directionLooking.equals("north"))
					|| (instruction.charAt(0) == 'L' && directionLooking.equals("south"))) {
				this.x += Integer.parseInt(instruction.substring(1)); 
				directionLooking = "east";
				
			}else if((instruction.charAt(0) == 'L' && directionLooking.equals("north")) 
					|| (instruction.charAt(0) == 'R' && directionLooking.equals("south"))){
				this.x -= Integer.parseInt(instruction.substring(1));
				directionLooking = "west";
				
			}else if((instruction.charAt(0) == 'R' && directionLooking.equals("west")) 
					|| (instruction.charAt(0) == 'L' && directionLooking.equals("east"))){
				this.y += Integer.parseInt(instruction.substring(1));
				directionLooking = "north";
				
			}else if((instruction.charAt(0) == 'L' && directionLooking.equals("west")) 
					|| (instruction.charAt(0) == 'R' && directionLooking.equals("east"))){
				this.y -= Integer.parseInt(instruction.substring(1)); 
				directionLooking = "south";
				
			}
			System.out.println("Moved " + instruction + "\t Now my location is : (" + this.x + ", " + this.y + ") and I'm facing " + directionLooking);
		
		}
		
//		 PART ONE
		System.out.println("\nANSWER");
		System.out.println("I am " + (Math.abs(this.x) + Math.abs(this.y)) + " blocks from headquarters");
	}

	public ArrayList<String> fileToList() throws FileNotFoundException {
		File file = new File(
				"C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\AoC2016_Problem01.txt");
		Scanner scan = new Scanner(file);
		ArrayList<String> inputList = new ArrayList<String>();
		while (scan.hasNextLine()) {
			String str = scan.next().replace(",", "");
			inputList.add(str);
		}
		return inputList;
	}
}
