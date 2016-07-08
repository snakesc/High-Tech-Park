package by.park.hightech;
import java.util.Scanner;

public class Waight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ВВедите ваш рост :");
		int growth = sc.nextInt();
		System.out.println("Введите ваш вес :");
		int weight = sc.nextInt();
		int difference = growth - 100;
		if (difference > weight){
			System.out.println("Вам надо поправиться ");
		}
		if (difference < weight){
			System.out.println("вам необходимо похудеть");
		}
		if (difference == weight){
			System.out.println("у вас идеальный вес");
		}

	}

}
