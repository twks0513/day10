package day10;

import java.util.Scanner;

public class QuizMainClass03 {

	public static void main(String[] args) {
		QuizTestClass03 q = new QuizTestClass03();
		
		int[] arr = q.inputNum();
		int r = q.result(arr);
		q.printnum(arr, r);
		
	}

}
