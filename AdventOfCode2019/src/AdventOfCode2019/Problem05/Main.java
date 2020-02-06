package AdventOfCode2019.Problem05;
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
					System.out.println("The winning list: " + longList.getNumberList());

					break outerloop;
				}
			}
		}
	}
}