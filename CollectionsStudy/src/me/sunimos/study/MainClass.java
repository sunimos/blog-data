package me.sunimos.study;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
  public static void main(String[] args) {
    List noGenericsList = new ArrayList();
    List<String> strList = new ArrayList<>();
    
    noGenericsList.add("aaaaaa");
    noGenericsList.add(1111);
    
    strList.add("문자다");
    strList.add("알기쉬운 문장이다");
    
    try {
      for (int i = 0; i < noGenericsList.size(); i++) {
        // 제네릭을 지정하지 않아 어떤 데이터 형식인지 판단하려면 입력된 곳을 찾아가야 알 수 있다.
        String str = (String) noGenericsList.get(i);
        System.out.println("index [" + i + "] 데이터 : " + str);
      }
    } catch (Exception e) {
      System.out.println("오류가 발생하였다네..");
    }
    
    for (int i = 0; i < strList.size(); i++) {
      String str = strList.get(i);
      System.out.println("index [" + i + "] 데이터 : " + str);
    }
    
    CollectionsStudy cs = new CollectionsStudy();
    
    cs.printWithComma();
    cs.printReverse();
  }
}
