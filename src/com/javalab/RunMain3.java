package com.javalab;

import java.util.Scanner;

public class RunMain3 {

	public static void main(String[] args) {

		// 키보드에서 입력을 받아들이는 객체 생성
		Scanner in = new Scanner(System.in);
		int option;
		int number1, number2; // 키보드에서 받아들일 두 숫자 저장용 변수

		while (true) {
			System.out.println("Enter your choice 1.덧셈 2.뺄셈 3.나눗셈 4.곱셈");
			option = Integer.parseInt(in.next()); // 입력 문자 읽기

			if (option == 1) {
				System.out.println("1.덧셈");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1 + number2;
				System.out.println("덧셈 결과 : " + sum);
				System.out.println();
			} else if (option == 2) {
				System.out.println("2.뺄셈");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double minus = number1 - number2;
				System.out.println();
				System.out.println("뺄셈 결과 : " + minus);
			} else if (option == 3) {
				System.out.println("3.나눗셈");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double avg = (double) number1 / number2;
				System.out.printf("나눗셈 결과%.2f", avg);
				System.out.println();
			} else if (option == 4) {
				System.out.println("4.곱셈");
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double gop = number1 * number2;
				System.out.println("곰셈 결과 : " + gop);
				System.out.println();
			} else {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0); // 0-정상적으로 종료
				break;

			}
		}
	}

	private static void askForNumbers() {
		System.out.print("두 정수를입력하세요");

	}
}