package day10;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		TestClass02 test02 = new TestClass02();
		test02.test(1000,"안녕하세요");
		
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		System.out.println("수 입력");
		num1 = scan.nextInt();
		System.out.println("수 입력");
		num2 = scan.nextInt();
		
		test02.sumFunc(num1,num2);

	}

}
