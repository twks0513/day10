package day10;

import java.util.Scanner;

public class QuizTestClass03 {
	public int[] inputNum() {
		Scanner scan = new Scanner(System.in);
		int[] numArr = new int[2];
		System.out.print("수 입력 : ");
		numArr[0] = scan.nextInt();
		System.out.print("수 입력 : ");
		numArr[1] = scan.nextInt();
		
		return numArr;
	}
	
	public int result(int[] numArr) { 
		
		int sum = numArr[0]+numArr[1];

		return sum;
	}
	
	public void printnum(int[] numArr,int sum) {
		System.out.println("====출력====");
		System.out.println("수1 : "+numArr[0]+", 수2 : "+numArr[1]);
		System.out.println(numArr[0]+"+"+numArr[1]+"="+sum );
	}
}
