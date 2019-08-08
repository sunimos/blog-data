package me.sunimos.study;

/**
 * 어노테이션을 적용한 변수들만 있는 클래스.
 * 
 * @author sunimohs
 */
public class AnnotationClass {
  @CustomAnnotation("a")
  private String a = "a";
  
  @CustomAnnotation2(value = "b", comment = "설명을 쓰세요.")
  private String b = "b";
  
  @CustomAnnotation3(values = "")
  private String c = "c";
  
  @CustomAnnotation3(values = { "" })
  private String d = "d";
}
