/**
 * <pre>
 * org.dimigo.oop
 *    |_ SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args){
		int value=0;
		
		Snack[] snack = new Snack[]{
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칲","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		
	
		for(Snack s : snack) {
			s.printSnack();
			value += s.calcPrice();
		}
		
		System.out.println("총 구매 금액 : "+String.format("%,d",value)+"원");
		
	}
}
