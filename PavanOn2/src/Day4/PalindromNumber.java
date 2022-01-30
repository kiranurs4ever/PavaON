package Day4;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// If reveres = number then its a palindrom
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y =0;
		int num =0;
		int actual = x;
		
		while(x>0) {
			y=x%10;
			System.out.println("Y:"+y);
			num = num*10+y;
			System.out.println("num:"+num);
			x=x/10;
			System.out.println("x"+x);
		}
		System.out.println("Reverse is:"+num);
		if(actual == num) {
			System.out.println("Its a palindron");
		}
		else {
			System.out.println("Not a palindrom");
		}
		

	}

}
