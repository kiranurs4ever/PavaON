package Day4;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y =0;
		int num =0;
		
		while(x>0) {
			y=x%10;
			System.out.println("Y:"+y);
			num = num*10+y;
			System.out.println("num:"+num);
			x=x/10;
			System.out.println("x"+x);
		}
		System.out.println("Reverse is:"+num);
	}

}
