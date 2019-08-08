package com.tistory.sunimohs.study;

public class MainClass {
	public static void main(String[] args) {
//		OverloadingStudy os = new OverloadingStudy();
		OverloadingStudy os = new OverridingStudy();
		
		System.out.println("문자열 길이 반환 : " + os.getStringLength("문자열 길이 반환"));
		System.out.println("문자열 길이 반환 : " + os.getStringLength(null));
	}
}
