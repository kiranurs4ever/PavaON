package Day4;

import java.util.Scanner;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int counter = 0;
		
		while(x>0) {
			x=x/10;
			System.out.println("The value of x is:"+ x);
			counter = counter+1;
			System.out.println("The counter is : "+ counter);
		}

		System.out.println("Ttoal number of digits: "+ counter);
	}

}
