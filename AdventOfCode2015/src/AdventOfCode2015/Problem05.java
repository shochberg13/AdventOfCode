package AdventOfCode2015;

import java.io.File;
import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) throws Exception {

		// Find matrix
		File file = new File("C:\\Users\\Seth\\Desktop\\Java\\Java Text Files\\Problem_5_input.txt");
		Scanner scan = new Scanner(file);
		String[] input = new String[1000];
		for (int i = 0; scan.hasNextLine(); i++) {
			input[i] = scan.nextLine();
		}

		// Part One
		// input = doesntHaveBadLetters(input);
		// howManyLeft(input);
		// input = hasTwoConsecutiveLetters(input);
		// howManyLeft(input);
		// input = hasEnoughVowels(input);
		// howManyLeft(input);

		// Part Two
		input = hasAbAPattern(input);
		howManyLeft(input);
		input = hasRepeatPairs(input);
		howManyLeft(input);

	}

	public static String[] hasAbAPattern(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean hasAbA = false;
			for (int j = 0; j < input[i].length() - 2; j++) {
				if (input[i].charAt(j) == input[i].charAt(j + 2)) {
					hasAbA = true;
					break;
				}
			}
			if (hasAbA == false) {
				input[i] = " ";
			}

		}
		return input;
	}

	public static String[] hasRepeatPairs(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean repeatPairs = false;
			for (int j = 0; j < input[i].length() - 3; j++) {
				for (int k = j + 2; k < input[i].length() - 1; k++) {
					if ((input[i].charAt(j) == input[i].charAt(k))
							&& (input[i].charAt(j + 1) == input[i]
									.charAt(k + 1))) {
						repeatPairs = true;
						break;
					}
				}
			}
			if (repeatPairs == false) {
				input[i] = " ";
			}
		}

		return input;
	}

	public static String[] doesntHaveBadLetters(String[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length() - 1; j++) {
				if ((input[i].charAt(j) == 'a' && input[i].charAt(j + 1) == 'b')
						|| (input[i].charAt(j) == 'c' && input[i].charAt(j + 1) == 'd')
						|| (input[i].charAt(j) == 'p' && input[i].charAt(j + 1) == 'q')
						|| (input[i].charAt(j) == 'x' && input[i].charAt(j + 1) == 'y')) {
					input[i] = "  ";
					break;
				}
			}
		}

		return input;
	}

	public static String[] hasEnoughVowels(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int vowelCounter = 0;
			for (int j = 0; j < input[i].length(); j++) {
				if (input[i].charAt(j) == 'a' || input[i].charAt(j) == 'e'
						|| input[i].charAt(j) == 'i'
						|| input[i].charAt(j) == 'o'
						|| input[i].charAt(j) == 'u') {
					vowelCounter += 1;
					if (vowelCounter >= 3) {
						break;
					}
				}
				if (j == input[i].length() - 1 && vowelCounter < 3) {
					input[i] = "  ";
				}
			}
		}
		return input;
	}

	public static String[] hasTwoConsecutiveLetters(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean hasAPair = false;
			for (int j = 0; j < input[i].length() - 1; j++) {
				if (input[i].charAt(j) == input[i].charAt(j + 1)) {
					hasAPair = true;
					break;
				}
			}
			if (hasAPair == false) {
				input[i] = "  ";
			}
		}
		return input;
	}

	public static int howManyLeft(String[] input) {
		int numberLeft = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 2) {
				numberLeft += 1;
			}
		}
		System.out.println("There are " + numberLeft + " strings left.");
		return numberLeft;
	}

	public static void printMatrix(String[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
}
