/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ Figure
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.inheritance;

public class Figure {
	private int centerX;
	private int centerY;
	
	
	public Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY; 
	}
	
	protected double calcArea(){
		return 0.0;
	}
}
