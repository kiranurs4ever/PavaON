package Day3;

import java.util.Scanner;

public class SamlestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Smallest of three numbers using if else 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter value of y: ");
		int y = sc.nextInt();
		System.out.println("Enter value of z: ");
		int z = sc.nextInt();
		
		if((x>y) && (x>z)) {
			System.out.println("X is greater");
		}
		else if((y>x) &&(y>z)) {
			System.out.println("Y is greater");
		}
		else {
			System.out.println("Z is greater");
		}
		
		
		

	}

}
