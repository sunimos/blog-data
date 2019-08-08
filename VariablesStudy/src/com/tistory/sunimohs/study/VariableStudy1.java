package com.tistory.sunimohs.study;

public class VariableStudy1 {
  public static void main(String[] args) {
    // char 형식 korChar 변수 선언 후 초기값 '한' 할당
    char korChar = '한';
    // korChar 변수를 화면에 출력
    System.out.println(korChar);

    // VariableStudy2 형식의 객체 v1, v2 생성
    VariableStudy2 v1 = new VariableStudy2();
    VariableStudy2 v2 = new VariableStudy2();

    // v1의 getAB() 호출
    System.out.println("v1.getAB() : " + v1.getAB());
    // v1의 getParameter에 5를 파라메터로 전달
    System.out.println("v1.getParameter(5) : " + v1.getParameter(5));

    // v1의 인스턴스 변수 a를 7로 변경
    v1.a = 7;

    // v1의 getAB() 호출
    System.out.println("v1.getAB() : " + v1.getAB());
    // v2의 getAB() 호출
    System.out.println("v2.getAB() : " + v2.getAB());

    // v1의 c를 7로 변경
    v1.c = 7;

    // v1의 c 화면에 출력
    System.out.println("v1.c : " + v1.c);
    // v2의 c 화면에 출력
    System.out.println("v2.c : " + v2.c);
    // VariableStudy2 클래스의 c 화면에 출력
    System.out.println("VariableStudy2.c : " + VariableStudy2.c);
  }
}
