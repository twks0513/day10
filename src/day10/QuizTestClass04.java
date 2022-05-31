package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTestClass04 {
	public ArrayList input() {//입력메소드
		ArrayList al = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		al.add(scan.nextInt());
		System.out.print("수 입력 : ");
		al.add(scan.nextInt());
		
		return al;
	}
	
	public int result(ArrayList al) {//연산메소드
		int sum = (int)al.get(0)+(int)al.get(1);
		
		return sum;
	}
	
	public void print(ArrayList al,int sum) {//출력메소드
		System.out.println(al.get(0)+"+"+al.get(1)+"="+sum);
	}
}
