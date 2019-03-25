package controlFlow;

public class Calculate_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i < 9; i++) {
			
		
		
		//System.out.println("The 2% interest amount of 10000 is: "+CalculateInterest(10000,2));
		System.out.println("The 2% interest amount of 10000 is: "+String.format("%.2f", CalculateInterest(10000,2)));
		}

	}
	public static double CalculateInterest(double amount, double interestRate) {
		return (amount*(interestRate/100));
	}

}
