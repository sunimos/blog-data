package me.sunimos.study;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WhileStudy {
  public void printWhile() {
    printAnimals();
    printAddToCart2();
  }
  
  private void printAnimals() {
    List<String> animals = Arrays.asList("사자", "표범", "고양이", "외계인", "사람");
    Iterator<String> iterator = animals.iterator();
    
    while(iterator.hasNext()) {
      String animal = iterator.next();
      
      System.out.println(String.format("이번에 소개할 동물은 %s입니다.", animal));
    }
    
//    결과는 동일
//    for (String animal : animals) {
//      System.out.println(String.format("이번에 소개할 동물은 %s입니다.", animal));
//    }
  }
  
  private void printAddToCart2() {
    int count = 0;
    int money = 5000;
    
    do {
      money -= 1000;
      count++;
      
      System.out.println(String.format("장바구니에 사과를 %d개 담아 %d원이 남을거에요.", count, money));
    } while(money > 0);
  }
}
