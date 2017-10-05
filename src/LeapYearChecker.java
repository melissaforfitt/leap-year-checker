import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		
		System.out.println("Input a year to check whether it is a leap year."); //take user input
		Scanner scan = new Scanner(System.in); //set up scanner
		int year = scan.nextInt();
		scan.close();
		
		if ((year % 400 == 0) || (year % 4 == 0)) { //if year is a century year or divisible by 4 then it is a leap year
			System.out.println(year + " is a leap year"); //if input follows if statement, output that it is a leap year
		}
		else System.out.println(year + " is not a leap year"); //else output that input is not a leap year
		
	}

}
