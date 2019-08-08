package me.sunimos.study;

/**
 * 강제로 4가 더해지는 덧셈 전용 계산기 클래스
 * @author sunimohs
 * @since 2017. 9. 26.
 */
public class StrangeCalculator {
  private final int FORCE_ADD_NUMBER = 4;
  // 현재 숫자 상태값
  private int calculatedNumber = 0;

  public int getCalculatedNumber() {
    return calculatedNumber;
  }
  
  public int add(int addNumber) {
    calculatedNumber += addNumber + FORCE_ADD_NUMBER;
    
    return calculatedNumber;
  }
}
