package me.sunimos.study;

/**
 * && 연산자 동작 확인 클래스
 * 
 * @author sunimos
 */
public class AndOperator {
	private int a = 5;
	private int b = 2;
	
	/**
	 * boolean 형식 true와 false 값으로 && 단순 비교하여 참 거짓을 확인한다.
	 */
	@SuppressWarnings("unused")
	public void printAndOperatorResult() {
		System.out.println("참 && 참 : " + (true && true));
		System.out.println("참 && 거짓 : " + (true && false));
		System.out.println("거짓 && 거짓 : " + (false && false));
	}
	
	/**
	 * 비교 연산자와 함께 사용하여 참 거짓을 확인한다.
	 */
	public void printAndOperatorResult2() {
		System.out.println("a > b && a > 2 : " + ((a > b) && (a > 2)));
		System.out.println("a > b && b > 2 : " + ((a > b) && (b > 2)));
	}
}
