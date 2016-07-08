package by.park.hightech;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = sc.nextInt();
		if (year %4 == 0){
			if ((year % 100 != 0) || (year % 400 == 0)){
				System.out.println("Leap year");
			}
			
		} 
		else {
			System.out.println("Year not leap");
		}
	}

}
