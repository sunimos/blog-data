package me.sunimos.study;

public class MainClass {
	
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		System.out.println("1, 1 equalsOperator : " + mc.equalsOperator(1, 1));
		System.out.println("1, 2 equalsOperator : " + mc.equalsOperator(1, 2));
		System.out.println("1, 1 notEqualsOperator : " + mc.notEqualsOperator(1, 1));
		System.out.println("1, 2 notEqualsOperator : " + mc.notEqualsOperator(1, 2));
		System.out.println();
		
		System.out.println("a, a equalsOperatorForString : " + mc.equalsOperatorForString("abcd", "abcd"));
		System.out.println("a, a equalsOperatorForString : " + mc.equalsOperatorForString(new String("abcd"), new String("abcd")));
		System.out.println();
		
		System.out.println("1, 2 lessThanOperator : " + mc.lessThanOperator(1, 2));
		System.out.println("1, 1 lessThanOrEqualsOperator : " + mc.lessThanOrEqualsOperator(1, 1));
		System.out.println();
		
		System.out.println("1, 2 greaterThanOperator : " + mc.greaterThanOperator(1, 2));
		System.out.println("1, 1 greaterThanOrEqualsOperator : " + mc.greaterThanOrEqualsOperator(1, 1));
	}
	
	/**
	 * 입력된 값 2개가 동일한지 확인하여 참 거짓을 반환한다.
	 * @param compare1 동일한 값인지 판단할 변수 
	 * @param compare2 동일한 값인지 판단할 변수 
	 * @return true 동일, false 동일하지 않음
	 */
	public boolean equalsOperator(int compare1, int compare2) {
		return compare1 == compare2;
	}

	/**
	 * 입력된 값 2개가 다른지 확인하여 참 거짓을 반환한다.
	 * @param compare1  동일한 값인지 판단할 변수 
	 * @param compare2 동일한 값인지 판단할 변수 
	 * @return true 다름, false 다르지 않음
	 */
	public boolean notEqualsOperator(int compare1, int compare2) {
		return compare1 != compare2;
	}
	
	/**
	 * 입력된 두 문자열이 같은지 확인하여 참 거짓을 반환한다.
	 * @param str1 동일한 값인지 판단할 변수
	 * @param str2 동일한 값인지 판단할 변수
	 * @return true 같음, false 다름
	 */
	public boolean equalsOperatorForString(String str1, String str2) {
		System.out.println("str1 hashCode : " + System.identityHashCode(str1) + " / str2 hashCode : " + System.identityHashCode(str2));
		System.out.println("eqauls operator : " + (str1 == str2) + " / eqauls method : " + str1.equals(str2));
		
		return str1.equals(str2);
	}
	
	/**
	 * 첫번째 입력한 값이 두번째 입력한 값보다 작은지 확인한다.
	 * @param compare1 작은지 확인할 값
	 * @param compare2 크거나 같은지 확인할 값
	 * @return true 첫번째 입력값이 작음, false 첫번째 입력값이 크거나 같음
	 */
	public boolean lessThanOperator(int compare1, int compare2) {
		return compare1 < compare2;
	}
	
	/**
	 * 첫번째 입력한 값이 두번째 입력한 값보다 작거나 같은지 확인한다.
	 * @param compare1 작거나 같은지 확인할 값
	 * @param compare2 큰지 확인할 값
	 * @return true 첫번째 입력값이 작거나 같음, false 첫번째 입력값이 큼
	 */
	public boolean lessThanOrEqualsOperator(int compare1, int compare2) {
		return compare1 <= compare2;
	}
	
	/**
	 * 첫번째 입력한 값이 두번째 입력한 값보다 큰지 확인한다.
	 * @param compare1 큰지 확인할 값
	 * @param compare2 작거나 같은지 확인할 값
	 * @return true 첫번째 입력값이 큼, false 첫번째 입력값이 작거나 같음
	 */
	public boolean greaterThanOperator(int compare1, int compare2) {
		return compare1 > compare2;
	}
	
	/**
	 * 첫번째 입력한 값이 두번째 입력한 값보다 크거나 같은지 확인한다.
	 * @param compare1 크거나 같은지 확인할 값
	 * @param compare2 작은지 확인할 값
	 * @return true 첫번째 입력값이 크거나 같음, false 첫번째 입력값이 작음
	 */
	public boolean greaterThanOrEqualsOperator(int compare1, int compare2) {
		return compare1 >= compare2;
	}
}