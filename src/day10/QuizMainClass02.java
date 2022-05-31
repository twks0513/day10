package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMainClass02 {

	public static void main(String[] args) {
		QuizTestClass02 quiz = new QuizTestClass02();
		
		String[] nameArr = quiz.inputName();
		quiz.printName(nameArr);
	}

}
