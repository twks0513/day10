package day10;

import java.util.Scanner;

public class QuizTestClass01 {
	
	public String inputName() {
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		return name;		
	}
	
	public void printName(String name) {	
				
		System.out.println("�̸� : "+name);
	}
}
