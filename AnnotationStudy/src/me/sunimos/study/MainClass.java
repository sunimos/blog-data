package me.sunimos.study;

import java.lang.reflect.Field;

/**
 * 어노테이션 테스트 메인 클래스
 * 
 * @author sunimohs
 * @since 2017. 10. 10.
 */
@CustomAnnotation3(values = "")
public class MainClass {
  public static void main(String[] args) {
    AnnotationClass ac = new AnnotationClass();
    
    try {
      Class<? extends AnnotationClass> acCls = ac.getClass();
      
      Field a = acCls.getDeclaredField("a");
      Field b = acCls.getDeclaredField("b");
      Field c = acCls.getDeclaredField("c");
      Field d = acCls.getDeclaredField("d");
      
      if (a.isAnnotationPresent(CustomAnnotation.class)) {
        System.out.println("a 필드 어노테이션 확인");
      } else if (b.isAnnotationPresent(CustomAnnotation2.class)) {
        System.out.println("b 필드 어노테이션 확인");
      } else if (c.isAnnotationPresent(CustomAnnotation3.class) || d.isAnnotationPresent(CustomAnnotation3.class)) {
        System.out.println("c 혹은 d 필드 어노테이션 확인");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
