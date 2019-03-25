package controlFlow;

public class Prime_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i = 10; i < 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("(Non Optimized)"+"The Number " +i+ " is a prime number");
				if (count ==10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}

	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		
		for (int i = 2; i <=n/2; i++) { //not optimized
		//for (int i = 2; i <=n/Math.sqrt(102); i++) { //optimized
			System.out.println("Loop is iterating " +i+ "times!");
			if (n%1==0) {
				return false;
			}
		}
		return true;
	}

}
