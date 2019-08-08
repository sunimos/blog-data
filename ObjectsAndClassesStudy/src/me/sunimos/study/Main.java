package me.sunimos.study;

public class Main {
  public static void main(String[] args) {
    StrangeCalculator strangeCalculator = new StrangeCalculator();
    
    System.out.println("현재 기본값 : " + strangeCalculator.getCalculatedNumber() + " / add(3) 결과 : " + strangeCalculator.add(3));
    System.out.println("현재 기본값 : " + strangeCalculator.getCalculatedNumber() + " / add(7) 결과 : " + strangeCalculator.add(7));
    
    // 오류 주석
//    System.out.println("직접 접근이 가능한가? : " + strangeCalculator.calculatedNumber);
  }
}
