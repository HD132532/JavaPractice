/**
 * <pre>
 * org.dimigo.collection
 *    |_ MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {		
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		List<Music> ballad = new ArrayList<Music>();
		List<Music> dance = new ArrayList<Music>();
		
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		printMap(map);
		
		System.out.println("\n----- << 발라드 3위 곡 변경 >> -----");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		
		System.out.println("\n----- << 댄스 1위 곡 삭제 >> -----");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println("\n----- << 전체 리스트 삭제 >> -----");
		map.clear();
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String a : map.keySet()){
			int i=0;
			System.out.println("["+a+"]");
			for(Music m : map.get(a)){
				i++;
				System.out.println(i+"."+m.toString());
			}
		}
	}
}
