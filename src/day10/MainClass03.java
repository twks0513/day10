package day10;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		TestClass03 test03 = new TestClass03();
		
		String s = test03.test();
		System.out.println("���� : "+s);
		
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		System.out.println("�� �Է�");
		num1 = scan.nextInt();
		System.out.println("�� �Է�");
		num2 = scan.nextInt();
		
		int sum = test03.sumFunc(num1, num2);
		
		System.out.println("�� ���� �� : "+sum);
	}

}
