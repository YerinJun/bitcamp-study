package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Exam0110 {

  //별 앞에 공백 출력
  static void printSpaces (int len) {
    //int spaceLen = (len - starLen) / 2;
    for (int i = 0 ; i <= len; i++) {
      System.out.print(" ");
    }
  }
  static void printStars (int len) {
    // 별 출력

    for (int i = 0; i <= len; i++) {
      System.out.print("*");
    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();


    for (int starLen = 1; starLen <= len; starLen += 2) {
      // 출력 줄 바꾸기
      System.out.println();

    }
  }
}