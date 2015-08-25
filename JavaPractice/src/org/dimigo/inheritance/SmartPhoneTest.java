/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.inheritance;

public class SmartPhoneTest {
	public static void main(String[] args){
		SmartPhone[] phones = {
				new IPhone("iPhone", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone p : phones){
			System.out.println(p.toString());
			p.turnOn();
			p.pay();
			p.useSpecialFunction();
			p.turnOff();
			System.out.println();
		}
		
	}
}
