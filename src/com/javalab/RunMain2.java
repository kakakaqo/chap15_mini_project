package com.javalab;

import java.util.Scanner;

/**
 * 콘솔 메뉴
 */

public class RunMain2 {

	public static void main(String[] args) {

		// 키보드에서 입력을 받아들이는 객체
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int option;
		while (true) {
			System.out.println("번호를 입력하세요. 1. 덧셈  2. 뺄셈 3. 나눗셈  4. 곱셈");
			option = Integer.parseInt(in.next()); // 문자열이 들어오면 int로 변환해줌

			switch (option) {
			case 1:
				System.out.println("1.덧셈");

				System.out.println("두 정수의 합은 : " + sum);
				break;

			case 2:
				System.out.println("2.뺄셈");
				break;

			case 3:
				System.out.println("3.나눗셈");
				break;

			case 4:
				System.out.println("4.곱셈");
				break;

			default:
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

		} // end while

	} // end main

	private static void askForNumbers() {
		System.out.print("두 개의 숫자를 입력하세요.");
		System.out.println();
	}

}
