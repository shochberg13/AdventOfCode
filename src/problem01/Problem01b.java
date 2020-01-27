package problem01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem01b {
	private int x;
	private int y;
	private ArrayList<MyCoord> coordList;
	
	public Problem01b() {
		this.x = 0;
		this.y = 0;
		this.coordList = new ArrayList<MyCoord>();
	}

	public void problemStart() throws FileNotFoundException{
		ArrayList<String> inputList = this.fileToList();
		String directionLooking = "north";
		System.out.println("My first location is : (" + this.x + ", " + this.y + ")");
	
		
		for(String instruction : inputList){
			int distance = Integer.parseInt(instruction.substring(1));
			directionLooking = findDirection(instruction, directionLooking);
			if(addToCoordList(distance, directionLooking)){
				break;
			}
		}
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

	public boolean addToCoordList(int distance, String directionLooking) {
		for (int i = 0; i < distance; i++){
			MyCoord newCoordinate = new MyCoord(this.x, this.y);
			if (coordList.contains(newCoordinate)){
				System.out.println("");
				System.out.println("ANSWER");
				System.out.println("I've already been here! (" + this.x + ", " + this.y + ")");
				System.out.println("Therefore, I know I am " + (Math.abs(this.x) + Math.abs(this.y)) + " blocks away from headquarters" );
				return true;
			}

			coordList.add(newCoordinate);
			
			if (directionLooking.equals("north")){
				this.y += 1;
			}else if(directionLooking.equals("south")){
				this.y -= 1;
			}else if(directionLooking.equals("west")){
				this.x -= 1;
			}else if(directionLooking.equals("east")){
				this.x += 1;
			}
			System.out.println("Moved " + directionLooking + " " + distance + "\t Now my location is : (" + this.x + ", " + this.y + ") and I'm facing " + directionLooking);
		}
		return false;
	}
	
	public String findDirection(String instruction, String directionLooking){
		if ((instruction.charAt(0) == 'R' && directionLooking.equals("north"))
				|| (instruction.charAt(0) == 'L' && directionLooking.equals("south"))) {
			return "east";
		
		}else if((instruction.charAt(0) == 'L' && directionLooking.equals("north")) 
				|| (instruction.charAt(0) == 'R' && directionLooking.equals("south"))){
			return "west";
			
		}else if((instruction.charAt(0) == 'R' && directionLooking.equals("west")) 
				|| (instruction.charAt(0) == 'L' && directionLooking.equals("east"))){
			return "north";
			
		}else if((instruction.charAt(0) == 'L' && directionLooking.equals("west")) 
				|| (instruction.charAt(0) == 'R' && directionLooking.equals("east"))){
			return "south";
		}
		return null;
	}
}
