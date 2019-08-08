package com.tistory.sunimohs.study;

/**
 * override 공부 클래스
 * @author sunimohs
 */
public class OverridingStudy extends OverloadingStudy {
	public OverridingStudy() {
		// 부모 클래스의 생성자 호출
		super();
	}

	/**
	 * {@link OverloadingStudy#getStringLength(String)}의 문제점인 null 예외처리를 추가한 메소드
	 * 
	 * @see OverloadingStudy#getStringLength(String)
	 */
	@Override
	public int getStringLength(String string) {
		if (string == null) {
			return 0;
		}
		
		return super.getStringLength(string);
	}
}
