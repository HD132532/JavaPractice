/**
 * <pre>
 * org.dimigo.oop
 *    |_ PiggyBank
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 12.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.oop;

public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		System.out.println();
		balance += amount;
	}
	
	public static void stealMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " + amount + "원을 스틸해감!");
		System.out.println();
		balance -= amount;
	}
	
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
		System.out.println();
	}
	
}
