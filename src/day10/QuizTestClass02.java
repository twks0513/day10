package day10;

import java.util.Scanner;

public class QuizTestClass02 {

	public String[] inputName() {
		String[] nameArr = new String[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<nameArr.length; i++) {
			System.out.print((i+1)+".�̸� �Է� : ");
			nameArr[i] = scan.next();
		}
		return nameArr;
	}
	
	public void printName(String[] nameArr) {
		System.out.println("====�̸����===="); 
		for(int i =0; i<nameArr.length; i++) {
			System.out.println((i+1)+"."+nameArr[i]);
		}
	}
	
}
