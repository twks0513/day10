package day10;

import java.util.Scanner;

public class QuizTestClass03 {
	public int[] inputNum() {
		Scanner scan = new Scanner(System.in);
		int[] numArr = new int[2];
		System.out.print("�� �Է� : ");
		numArr[0] = scan.nextInt();
		System.out.print("�� �Է� : ");
		numArr[1] = scan.nextInt();
		
		return numArr;
	}
	
	public int result(int[] numArr) { 
		
		int sum = numArr[0]+numArr[1];

		return sum;
	}
	
	public void printnum(int[] numArr,int sum) {
		System.out.println("====���====");
		System.out.println("��1 : "+numArr[0]+", ��2 : "+numArr[1]);
		System.out.println(numArr[0]+"+"+numArr[1]+"="+sum );
	}
}
