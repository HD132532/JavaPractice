package org.dimigo.basic;

public class Operator {
	public static void main(String[] args){
		int a=9;
		int b=10;
		double h1=5.8;
		double h2=5.4;
		
		double s1=(double)(a + b) * h1 / 2;
		double s2=(double)a * h2;
		
		System.out.println("사다리꼴 넓이 : "+s1);
		System.out.println("평행 사변형 넓이 : "+s2);
		
		if(s1>s2)
			System.out.println("사다리꼴이 평행사변형보다 "+(s1-s2)+" 더 큽니다.");
		
		else if(s1==s2)
			System.out.println("두 도형의 넓이가 같습니다.");
		
		else
			System.out.println("평행사변형이 사다리꼴보다 "+(s2-s1)+" 더 큽니다.");		
	}
}
