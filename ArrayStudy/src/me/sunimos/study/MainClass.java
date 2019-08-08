package me.sunimos.study;

import java.util.Arrays;

public class MainClass {
  public static void main(String[] args) {
    int[] intArray = new int[5];
    intArray = new int[]{ 11, 22, 33, 44, 55 };
    
    System.out.println("intArray 1 : " + intArray[0]);
    
    intArray[0] = 66;
    
    System.out.println("intArray 1 : " + intArray[0]);
    
    try {
      System.out.println("intArray 6 : " + intArray[5]);
    } catch (Exception e) {
      System.out.println("배열 범위를 벗어났어요.");
    }
    
    System.out.println("intArray 배열의 길이 : " + intArray.length);
    
    printArray(intArray);
    
    System.out.println("Arrays 클래스의 기본 정렬 시작");
    Arrays.sort(intArray);
    
    printArray(intArray);
  }
  
  private static void printArray(int[] intArray) {
    for (int i = 0; i < intArray.length; i++) {
      System.out.println("intArray[" + i + "] 값 : " + intArray[i]);
    }
  }
}
