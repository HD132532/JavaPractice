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

public class PiggyBankTest {
	public static void main(String[] args){
		FamilyMember family[] = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(family[2], 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.stealMoney(family[3], 1000);
		
		PiggyBank.printBalance();
	}
}
