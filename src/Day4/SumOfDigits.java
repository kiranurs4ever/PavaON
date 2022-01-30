package Day4;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		int sum =0;
		
		
		while(x>0) {
			y = x%10;
			System.out.println(" value of Y :"+y);
			sum = sum+y;
			System.out.println("Sum :"+sum);
			x = x/10;
			System.out.println("x :"+x);
		}
		System.out.println(" Total sum ="+sum);

	}

}
