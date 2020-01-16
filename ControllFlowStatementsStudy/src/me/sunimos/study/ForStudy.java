package me.sunimos.study;

public class ForStudy {
  public ForStudy() {}
  
  public void printFor() {
    printAddToCart();
    printExhibition();
  }
  
  private void printAddToCart() {
    int count = 0;
    int money = 5000;
    
    // 돈이 5000원 있고 모든 돈을 사용해서 구입하고 싶은 상황.
    // 사과는 개당 1000원. 
    // 증감식은 조건을 만족하면 한 번 돌고 나서 수행하기 때문에 초기화로 사과값 1000원을 빼고 수행.
    for (money -= 1000; money >= 0; money -= 1000) {
      count++;
      
      System.out.println(String.format("장바구니에 사과를 %d개 담아 %d원이 남을거에요.", count, money));
    }
  }
  
  private void printExhibition() {
    String[] contents = new String[] { "풍경화", "초상화", "멋쟁이 그림", "값비싼 그림", "이세상의 것이 아닌 그림" };
    
    for (String content : contents) {
      System.out.println(String.format("전시장에서 %s 전시중.", content));
    }
  }
}
