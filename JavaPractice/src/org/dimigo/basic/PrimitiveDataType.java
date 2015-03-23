package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name="아이유";
		boolean bgender=true;
		String gender;
		int age =23;
		double height=161.8;
		float weight=(float)44.3;
		char blood='A';
		
		if (bgender) gender="여자";
		else gender="남자";

		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+blood+"형");

	}

}