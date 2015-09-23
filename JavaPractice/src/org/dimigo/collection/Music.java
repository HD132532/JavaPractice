/**
 * <pre>
 * org.dimigo.collection
 *    |_ Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.collection;

import java.util.List;

public class Music {
	private String title;
	private String singer;
	
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public void printList(List<Music> list){
		System.out.println();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
}
