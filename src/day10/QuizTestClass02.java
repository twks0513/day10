package day10;

import java.util.Scanner;

public class QuizTestClass02 {

	public String[] inputName() {
		String[] nameArr = new String[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<nameArr.length; i++) {
			System.out.print((i+1)+".이름 입력 : ");
			nameArr[i] = scan.next();
		}
		return nameArr;
	}
	
	public void printName(String[] nameArr) {
		System.out.println("====이름출력===="); 
		for(int i =0; i<nameArr.length; i++) {
			System.out.println((i+1)+"."+nameArr[i]);
		}
	}
	
}
