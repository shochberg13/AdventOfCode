package AdventOfCode2019.Problem04;

public class Main{
	public static void main(String[] args) {

		executePart2();
	}

	public static void executePart1() {
		int passwordCounter = 0;
		for (int i = 254032; i <= 789860; i++) {
			if (neverDecrease(i) && hasSameAdjacentDigits(i)) {
				passwordCounter += 1;
			}
		}
		System.out.println("There are " + passwordCounter + " good passwords.");
	}

	public static void executePart2() {
		int passwordCounter = 0;
		for (int i = 254032; i <= 789860; i++) {
			if (neverDecrease(i) && hasOnlyTwoSameAdjacentDigits(i)) {
				passwordCounter += 1;
			}
		}
		System.out.println("There are " + passwordCounter + " good passwords.");
	}

	public static int howManyDigits(int largeNumber) {
		int holder = largeNumber;
		int numberOfDigits = 0;
		do {
			holder = holder / 10;
			numberOfDigits += 1;

		} while (holder != 0);
		return numberOfDigits;
	}

	public static int indexDigit(int largeNumber, int index) {
		// If index is out of bounds, return -1
		if (index >= howManyDigits(largeNumber) || index < 0) {
			return -1;
		}

		int holder = largeNumber;
		for (int i = 1; i < howManyDigits(largeNumber) - index; i++) {
			holder = holder / 10;
		}
		return holder % 10;
	}

	public static boolean neverDecrease(int largeNumber) {
		for (int i = 0; i < howManyDigits(largeNumber) - 1; i++) {
			if (indexDigit(largeNumber, i) > indexDigit(largeNumber, i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean hasSameAdjacentDigits(int largeNumber) {
		for (int i = 0; i < howManyDigits(largeNumber) - 1; i++) {
			if (indexDigit(largeNumber, i) == indexDigit(largeNumber, i + 1)) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasOnlyTwoSameAdjacentDigits(int largeNumber) {
		for (int i = 0; i < howManyDigits(largeNumber) - 1; i++) {
			if (indexDigit(largeNumber, i) == indexDigit(largeNumber, i + 1) &&
				indexDigit(largeNumber, i) != indexDigit(largeNumber, i + 2) &&
			    indexDigit(largeNumber, i) != indexDigit(largeNumber, i - 1)) {

				return true;
			}
		}
		return false;
	}

}
