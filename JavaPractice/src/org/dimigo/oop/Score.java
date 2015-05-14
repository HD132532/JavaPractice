package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 * 
 *    |_ Score
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */

public class Score {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();

		scanner.close();
		
		StringBuilder sb = new StringBuilder("<< 점수 출력 >>\n")
		.append("국어 점수 : "+kor+"점 \n")
		.append("수학 점수 : "+mat+"점 \n")
		.append("영어 점수 : "+eng+"점 \n")
		.append("총점 : "+(kor+mat+eng)+"점 \n")
		.append("평균 : "+String.format("%.1f",(kor+mat+eng)/3.0)+"점 \n");
		
		System.out.println(sb);
	}
}
