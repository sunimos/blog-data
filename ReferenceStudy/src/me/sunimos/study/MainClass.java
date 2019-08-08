package me.sunimos.study;

public class MainClass {
  public static void main(String[] args) {
    printStudy1();
    
    printStudy2();
  }
  
  public static void printStudy1() {
    int value1 = 0;
    int value2 = value1;
    
    ReferenceObject object1 = new ReferenceObject();
    ReferenceObject object2 = object1;
    
    value1 = 5;
    object1.value = 5;
    
    System.out.println("print study1 start");
    
    System.out.println("value1 : " + value1);
    System.out.println("value2 : " + value2);
    
    System.out.println("object1.value : " + object1.value);
    System.out.println("object2.value : " + object2.value);
    
    System.out.println();
  }
  
  public static void printStudy2() {
    int value = 0;
    ReferenceObject ro = new ReferenceObject();
    
    System.out.println("print study2 start");
    
    System.out.println("value : " + value);
    System.out.println("reference object value : " + ro.value);
    callByValue(value);
    callByReference(ro);
    System.out.println("value : " + value);
    System.out.println("reference object value : " + ro.value);
  }
  
  public static void callByValue(int value) {
    value = 5;
    
    System.out.println("callByValue value : " + value);
  }
  
  public static void callByReference(ReferenceObject referenceObject) {
    referenceObject.value = 5;
    
    System.out.println("callByReference value : " + referenceObject.value);
  }
}
