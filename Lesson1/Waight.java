package by.park.hightech;
import java.util.Scanner;

public class Waight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ���� :");
		int growth = sc.nextInt();
		System.out.println("������� ��� ��� :");
		int weight = sc.nextInt();
		int difference = growth - 100;
		if (difference > weight){
			System.out.println("��� ���� ����������� ");
		}
		if (difference < weight){
			System.out.println("��� ���������� ��������");
		}
		if (difference == weight){
			System.out.println("� ��� ��������� ���");
		}

	}

}
