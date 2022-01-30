package Day3;

import java.util.Scanner;

public class LargestOfTwoNum {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number x:");
		int x = sc.nextInt();
		System.out.println("Enter a number y:");
		int y = sc.nextInt();
		
		// Using loop
		if(x>y) {
			System.out.println(" X is larger");
		}
		else {
			System.out.println("Y is larger");
		}
		
		// Using ternary operator
		System.out.println(x>y?"X is larger":"Y is larger");
		
	}

}
