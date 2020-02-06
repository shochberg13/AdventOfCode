package AdventOfCode2019.Problem05;
import java.util.ArrayList;


public class Helper {
	private ArrayList<Integer> numberList;
	
	public Helper(ArrayList<Integer> numberList){
		this.numberList = numberList;
	}
	
	public ArrayList<Integer> getNumberList(){
		return this.numberList;
	}
	
	
	public void setNumberList(int index, int number){
		this.numberList.set(index, number);
	}
	
	public void runProgram(){
		for (int i = 0; i < this.numberList.size() - 3; i+=4){
			if (this.numberList.get(i) == 99){
				break;
			}
			opCode(i, this.numberList.get(i));
		}
		
	}	

	public void opCode(int index, int opCodeNumber){
		int value1 = this.numberList.get(index + 1);
		int value2 = this.numberList.get(index + 2);
		
		
		if (opCodeNumber == 1){
			this.numberList.set(this.numberList.get(index + 3), this.numberList.get(value1) + this.numberList.get(value2));
		} else if (opCodeNumber == 2){
			this.numberList.set(this.numberList.get(index + 3), this.numberList.get(value1) * this.numberList.get(value2));
		}
	}
}
