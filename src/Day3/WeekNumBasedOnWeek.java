package Day3;

import java.util.Scanner;

public class WeekNumBasedOnWeek {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a name of week: ");
		Scanner sc = new Scanner(System.in);
		String weekName = sc.nextLine();
		
		switch(weekName) {
			case "Sunday" : System.out.println(" 1 ");
			break;
			case "Monday" : System.out.println(" 2 ");
			break;
			case "Tuesday" : System.out.println(" 3 ");
			break;
			default : System.out.println("Wrong Number");
		}
		
		System.out.println("Enter number of the month");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:System.out.println(" Jan");
		break;
		case 2:System.out.println(" Feb");
		break;
		default: System.out.println("Wrong Month :");
		}
		
	}

}
