package me.sunimos.study;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 커스텀 어노테이션<br/>
 * Documented : javadoc으로 문서 생성 시 현재 어노테이션 설명 추가 <br/>
 * Retention : 어노테이션을 유지하는 정책 설정<br/>
 * Target : 어노테이션 적용 위치
 * 
 * @author sunimohs
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface CustomAnnotation {
  /**
   * 어노테이션 기본 값 value()로 설정된 데이터는 '@어노테이션명(파라메터 값)'로 설정 가능하다.<br/>
   * 그 외의 데이터는 '@어노테이션(파라메터 명 = 파라메터 값)'으로 사용
   */
  String value();
  
  /**
   * 'default 파라메터 기본 값'의 형식으로 작성 시 입력하지 않을 경우 기본 값 적용<br/>
   * default를 지정하지 않을 경우는 무조건 입력받아야 함.
   */
  String comment() default "";
}
