package me.sunimos.study;

import java.util.Calendar;

public class SwitchStudy {
  public void printSwitchStudy() {
    int week = Calendar.MONDAY;
    
    printTodolist(week);
  }
  
  private void printTodolist(int week) {
    switch(week) {
    case Calendar.MONDAY:
      printYoga();
      break;
    case Calendar.TUESDAY:
      printYoga();
      break;
    case Calendar.WEDNESDAY:
      printStudy();
      break;
    case Calendar.THURSDAY:
      printWatchTv();
      break;
    case Calendar.FRIDAY:
      printWatchMovie();
      break;
    case Calendar.SATURDAY:
    case Calendar.SUNDAY:
      printRest();
      break;
      default:
        // 아무것도 하지 않음.
        break;
    }
  }
  
  private void printYoga() {
    System.out.println("요가해요.");
  }
  
  private void printStudy() {
    System.out.println("공부해요.");
  }
  
  private void printRest() {
    System.out.println("쉬어요.");
  }
  
  private void printWatchTv() {
    System.out.println("TV를 봐요.");
  }
  
  private void printWatchMovie() {
    System.out.println("영화를 봐요.");
  }
}
 