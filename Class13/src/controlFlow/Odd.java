package controlFlow;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNumber=5;
		int finisLine=20;
		while (startNumber<=finisLine) {

			if (!isOdd(startNumber)) {
				startNumber++;
				continue;
			}else {
				System.out.println("Odd Number" + startNumber);
				startNumber++;
			}
			
			
		}

	}
	public static boolean isOdd(int number){
		if (number%2 !=0) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
