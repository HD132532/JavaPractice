/**
 * <pre>
 * org.dimigo.oop
 *    |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 제작자의 심정을 예측해보시오.");
		String answer = scanner.nextLine();
		if("모르겠다".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("5월 11일 기준 3교시를 기준으로 2학년 5반의 실내온도에 대한 제작자의 심정은");
		answer = scanner.nextLine();
		if("더워".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("(1+1+1+1+1+1+1+1+1+1+1+1) * 0=?");
		answer = scanner.nextLine();
		if("0".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");

	}

}
