package by.park.hightech;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� :");
		int year = sc.nextInt();
		if (year %4 == 0){
			if ((year % 100 != 0) || (year % 400 == 0)){
				System.out.println("��� ����������");
			}
			
		} 
		else {
			System.out.println("��� �� ����������");
		}
	}

}
