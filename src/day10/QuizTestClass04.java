package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTestClass04 {
	public ArrayList input() {//�Է¸޼ҵ�
		ArrayList al = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		al.add(scan.nextInt());
		System.out.print("�� �Է� : ");
		al.add(scan.nextInt());
		
		return al;
	}
	
	public int result(ArrayList al) {//����޼ҵ�
		int sum = (int)al.get(0)+(int)al.get(1);
		
		return sum;
	}
	
	public void print(ArrayList al,int sum) {//��¸޼ҵ�
		System.out.println(al.get(0)+"+"+al.get(1)+"="+sum);
	}
}
