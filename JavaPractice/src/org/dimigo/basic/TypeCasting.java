package org.dimigo.basic;

public class TypeCasting {
	public static void main(String args[]){
		int sallery=1700000;
		int member = 3;
		int store=1500;
  
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n",sallery);
		System.out.println("점포 내 직원 수 : "+member+"명");
		System.out.printf("점포 수 : %,d개\n\n\n",store);
		System.out.printf("연간 인건비 : %,d원",(long)sallery*12*member*store);
	}
}