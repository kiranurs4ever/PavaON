package assignments;

public class SwapNumberWithOutTemp {
	
	public static void main(String[] args) {
		// Program to swap numbers without temporary variables
		
		int x = 10;
		int y = 20;
		
		// To swap numbers
		x = x + y; // x becomes big
		y = x - y; // so from big you are removing y --> so its x
		x = x - y; // from big you are removing y(which is x previously) --> so its y
		
		System.out.println("After swap");
		System.out.println("value of x: "+ x);
		System.out.println("value of y: " + y);
		
	}

}
