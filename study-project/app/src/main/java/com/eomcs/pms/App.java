package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 500;
      int[] no = new int[MAX_LENGTH];
      String[] name = new int[MAX_LENGTH];
      String[] email = new int[MAX_LENGTH];
      String[] photo = new int[MAX_LENGTH];
      String[] tel = new int[MAX_LENGTH];
   
    Scanner keyboardScan = new Scanner(System.in);

    int size = 0;
    for(int i = 0; 0 < MAX_LENGTH; i++) {
      
    System.out.print("번호? ");
    no[i] = Integer.parseInt(keyboard.nextLine());

    System.out.print("이름? ");
    name[i] = keyboardScan.nextLine();

    System.out.print("이메일? ");
    email[i] = keyboardScan.nextLine();

    System.out.print("암호? ");
    password[i] = keyboardScan.nextLine();

    System.out.print("사진? ");
    photo [i] = keyboardScan.nextLine();

    System.out.print("전화? ");
    tel [i] = keyboardScan.nextLine();

    // 현재 일시 알아내기
    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());
    registeredDate = System.currentTimeMillis(keyboardScan.nextLine());
    
    // System.currentTimeMillis()
    //   - 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    // new java.sql.Date(밀리초)
    //  - 넘겨 받은 밀리초를 가지고 년,월,일,시,분,초를 계산한다.
    System.out.println("계속 입력하시겠습니까? (y/N)");
    String str = keyboardScan.nextLine();
    if (str.equalsIgnoreCase("n")) {
    break;
    }
    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.
    }
    
    
    System.out.println("--------------------------------");

    for(int i = 0; i < MAX_LENGTH; i++) {
    System.out.println("번호: " + no[i]);
    System.out.println("이름: " + name[i]);
    System.out.println("이메일: " + email[i]);
    System.out.printf("암호: %s\n", password[i]);
    System.out.printf("사진: %s\n", photo[i]);
    System.out.printf("전화: %s\n", tel[i]);
    System.out.printf("가입일: %s\n", now);
  }
}
