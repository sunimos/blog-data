package me.sunimos.study;

public class VariableStudy2 {
  // static으로 선언된 변수 c
  static int c = 10;
  // class VariableStudy1에 속한 변수 a
  int a = 5;

  public int getAB() {
    // getB method에 속한 변수 b
    int b = 2;
    // class 변수 a와 local variables b를 더하여 반환
    return a + b;
  }

  // 파라메터 d를 입력받아 반환하는 getParameter 메소드
  public int getParameter(int d) {
    return d;
  }
}
