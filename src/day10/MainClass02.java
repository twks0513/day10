package day10;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		TestClass02 test02 = new TestClass02();
		test02.test(1000,"�ȳ��ϼ���");
		
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		System.out.println("�� �Է�");
		num1 = scan.nextInt();
		System.out.println("�� �Է�");
		num2 = scan.nextInt();
		
		test02.sumFunc(num1,num2);

	}

}
