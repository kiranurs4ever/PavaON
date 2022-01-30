package Day4;

import java.util.Scanner;

public class CountEvenOddinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int even =0;
		int odd = 0;
		int y ;
		
		while(x>0) {
			y=x%10;
			System.out.println(" % of y :" + y);
			if(y%2 == 0) {
				even = even+1;
				System.out.println("even count:"+even);
			}
			else {
				odd = odd+1;
				System.out.println("odd count:"+odd);
			}
			x=x/10;
			System.out.println(" / of x :"+ x);
		}
		System.out.println("The even count :"+even);
		System.out.println("The odd count :"+odd);

	}

}
