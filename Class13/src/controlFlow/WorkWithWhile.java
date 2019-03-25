package controlFlow;

public class WorkWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int startNumber=5;
		int finisLine=20;
		int EvenNumberFound =0;
		while (startNumber<=finisLine) {

			if (!isEven(startNumber)) {
				startNumber++;
				continue;
			}else {
				System.out.println("Even Number" + startNumber);
				startNumber++;
			}
			
			EvenNumberFound++;
			if(EvenNumberFound>=5) {
				break;
			}
			
		}
		System.out.println("Total Even number found: " +EvenNumberFound);
		
		
	}

	
	public static boolean isEven(int number){
		if (number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
