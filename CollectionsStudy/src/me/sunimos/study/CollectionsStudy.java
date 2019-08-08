package me.sunimos.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsStudy {
  private List<String> strings = new ArrayList<>();
  
  public CollectionsStudy() {
    strings.add("a");
    strings.add("b");
    strings.add("c");
    strings.add("d");
    strings.add("e");
    strings.add("f");
    strings.add("g");
  }
  
  public void printWithComma() {
    printWithComma(strings);
  }
  
  private void printWithComma(List<String> list) {
    System.out.print("print result : ");
    
    for(int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      
      System.out.print(str);
      
      if (i + 1 < list.size()) {
        System.out.print(", ");
      }
    }
    
    System.out.println();
  }
  
  public void printReverse() {
    List<String> copyList = new ArrayList<>();
    
    for(String str : strings) {
      copyList.add(str);
    }
    
    Collections.reverse(copyList);
    
    printWithComma(copyList);
  }
}