import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem24 {
	public static void main(String[] args) throws Exception {

		ArrayList<Integer> inputList = fileToList();
		System.out.println("The input list as an array: " + inputList);

		int evenWeight = evenWeight(inputList);
		System.out.println("The evenly distributed weight: " + evenWeight);

		int mostPossiblePackages = mostPackagesPossible(inputList, evenWeight);
		System.out.println("The most packages possible in one section is "
				+ mostPossiblePackages);

	}

	public static ArrayList<Integer> fileToList() throws FileNotFoundException {

		File file = new File(
				"C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\Problem_24_input.txt");
		Scanner scan = new Scanner(file);

		ArrayList<Integer> input = new ArrayList<>();
		while (scan.hasNextLine()) {
			input.add(Integer.parseInt(scan.nextLine()));
		}
		return input;
	}

	public static int evenWeight(ArrayList<Integer> inputList) {
		int sum = 0;
		for (int numberInInput : inputList) {
			sum += numberInInput;
		}
		return sum / 3;
	}

	public static int mostPackagesPossible(ArrayList<Integer> inputList,
			int evenWeight) {
		int mostPackagesPossible = 0;
		int weightCounter = 0;
		for (int numbersInList : inputList) {
			weightCounter += numbersInList;
			mostPackagesPossible += 1;
			if (weightCounter > evenWeight) {
				mostPackagesPossible -= 1;
				break;
			}
		}

		return mostPackagesPossible;
	}

	public static int SOMETHING(ArrayList<Integer> inputList, int evenWeight, int mostPossiblePackages) {
		// Not sure what I'm returning yet

		ArrayList<Integer> tempInputList = inputList;
		
		List<String> group1 = new ArrayList<Integer>();
		ArrayList<Integer[]> group2 = new ArrayList<Integer[]>();
		ArrayList<Integer> group3 = new ArrayList<Integer>();
		
		for (int i = 0; i < inputList.size() - 1; i++){
			for (int j = i + 1; j < inputList.size(); j ++){
				if (inputList.get(i) + inputList.get(j) == evenWeight ){
					
					tempInputList.remove(i);
					tempInputList.remove(j);
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		return 0;
	}
}
