/**
 * <pre>
 * org.dimigo.exception
 *    |_ Movie
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 21.
 * </pre>
 *
 * @author				: 조홍기
 * @version			: 1.0
 */
package org.dimigo.exception;

public class MovieTest {
	public static void main(String[] args){
			Movie[] movies = {
					new Movie("앤트맨", 12),
					new Movie("사도", 12),
					new Movie("베테랑", 15)
			};
			int age = 13;
			for(Movie movie : movies){
				try{
				buyTicket(movie, age);
				} catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
		
	}
	private static void buyTicket(Movie movie, int age) throws Exception{
		if(age<movie.getLimitAge())
			throw new AgeCheckException(movie);
		System.out.println(movie.getTitle()+" 영화 즐감하세요");
	}
}
