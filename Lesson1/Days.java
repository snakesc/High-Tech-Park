package by.park.hightech;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���� ������ :");
		int x = sc.nextInt();
		switch (x){
		case 1:
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("�������");
			break;
		case 5:
			System.out.println("�������");
			break;
		case 6:
			System.out.println("�������");
			break;
		case 7:
			System.out.println("�����������");
			break;
			default:
				System.out.println("������ ��� �� ����������!");
		}

	}

}
