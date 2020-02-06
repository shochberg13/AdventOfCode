package AdventOfCode2015;

public class Problem01 {
	public static void main(String[] args) {

		String instructions = "()())(((";

		int floor = 0;
		for (int i = 0; i < instructions.length(); i++) {
			if (instructions.charAt(i) == '(') {
				floor = floor + 1;
			} else {
				floor = floor - 1;
			}
			if (floor < 0) {
				System.out.println("Santa arrives at the basement at position: "	+ i);
				break;
			}

		}

		// System.out.println("Santa should arrive on floor " + floor);

	}
}
