package me.sunimos.study;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
  public static void main(String[] args) {
    MainClass mc = new MainClass();
    
    List<Integer> intArray = new ArrayList<>();
    
    intArray.add(1);
    // 직접 생성
    intArray.add(new Integer(2));
    intArray.add(3);
    
    mc.printArray(intArray);
    
    Integer firstElement = intArray.get(0);
    
    int unboxing = firstElement.intValue();
    int autoUnboxing = firstElement;
    Integer boxing = new Integer(unboxing);
    Integer autoBoxing = unboxing;
    
    System.out.println("print values : " + unboxing + " / " + autoUnboxing 
        + " / " + boxing + " / " + autoBoxing);
  }
  
  private <T> void printArray(List<T> list) {
    System.out.print("print result : ");
    
    for (T t : list) {
      System.out.print(t.toString() + " ");
    }
    
    System.out.println();
  }
}
