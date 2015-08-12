/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ Circle
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.inheritance;

public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width,int height){
		super(0,0);
		this.width=width;
		this.height=height;
	}
	
	public Triangle(int centerX, int centerY, int width,int height){
		super(centerX, centerY);
		this.width=width;
		this.height=height;
	}
	
	protected double calcArea(){
		return width*height*0.5;
	}
}
