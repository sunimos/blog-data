package me.sunimos.study;

public class Main {
  public static void main(String[] args) {
    IfStudy ifStudy = new IfStudy();
    SwitchStudy switchStudy = new SwitchStudy();
    ForStudy forStudy = new ForStudy();
    WhileStudy whileStudy = new WhileStudy();
    
    ifStudy.printIfStudy();
    switchStudy.printSwitchStudy();
    forStudy.printFor();
    whileStudy.printWhile();
  }
}
