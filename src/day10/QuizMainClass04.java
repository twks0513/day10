package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMainClass04 {

	public static void main(String[] args) {
		QuizTestClass04 q4 = new QuizTestClass04();
		
		ArrayList al =q4.input();
		int sum = q4.result(al);
		q4.print(al, sum);
	}

}
