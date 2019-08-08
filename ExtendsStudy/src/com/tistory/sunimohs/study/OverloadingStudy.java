package com.tistory.sunimohs.study;

/**
 * overloading 공부 클래스
 * @author sunimohs
 */
public class OverloadingStudy {
	/**
	 * 파라메터로 입력받은 {@link String string}의 길이를 반환하는 메소드
	 * @param string 길이를 확인할 문자열
	 * @return string의 길이
	 */
	public int getStringLength(String string) {
		return string.length();
	}
	
	/**
	 * 파라메터로 입력받은 {@link String string} + {@link String string2}의 길이를 반환하는 메소드
	 * @param string 길이를 확인할 문자열
	 * @param string2 길이를 확인할 문자열2
	 * @return string + string2의 길이
	 */
	public int getStringLength(String string, String string2) {
		return getStringLength(string) + getStringLength(string2);
	}
}
