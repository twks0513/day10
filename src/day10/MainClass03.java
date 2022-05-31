package day10;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		TestClass03 test03 = new TestClass03();
		
		String s = test03.test();
		System.out.println("리턴 : "+s);
		
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		System.out.println("수 입력");
		num1 = scan.nextInt();
		System.out.println("수 입력");
		num2 = scan.nextInt();
		
		int sum = test03.sumFunc(num1, num2);
		
		System.out.println("두 수의 합 : "+sum);
	}

}
