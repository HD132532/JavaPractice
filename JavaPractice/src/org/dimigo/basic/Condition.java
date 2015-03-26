package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance=10;
		String car="그 외";
		int fee;
		System.out.println("<< 고속도로 통행료 계산 >>");
		switch(car)
		{
		case "고속버스": 
			fee=850;
			if(distance>10)
				fee+=(((distance-1)/10))*300;
			break;
		case "경차" : 
			fee=300;
			if(distance >10)
				fee+=(((distance-1)/10))*200;
		default : 
			fee=600;
			if(distance >10)
				fee+=(((distance-1)/10))*200;
		}
		System.out.println("거리 : "+distance+"km");
		System.out.println("차종 : "+car);
		System.out.println("통행료 : "+fee+"원");

	}

}
