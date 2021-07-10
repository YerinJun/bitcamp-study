package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner keyboardScan = new Scanner(System.in);

<<<<<<< HEAD
    System.out.print("프로젝트? ");
    String project = keyboardScan.nextLine();

    System.out.print("번호? ");
    int no = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("내용? ");
    String content = keyboardScan.nextLine();

    System.out.print("마감일? ");
    Date deadline = Date.valueOf(keyboardScan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("담당자? ");
    String owner = keyboardScan.nextLine();

    keyboardScan.close();

    System.out.println("--------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("마감일: %s\n", deadline);

    switch (status) {
      case 1:
        System.out.println("상태: 진행중");
        break;
      case 2:
        System.out.println("상태: 완료");
        break;
      default:
        System.out.println("상태: 신규");
    }

    System.out.printf("담당자: %s\n", owner);
=======
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] deadline = new Date[LENGTH];
    int[] status = new int[LENGTH];
    String[] owner = new String[LENGTH];

    System.out.print("프로젝트? ");
    String project = keyboardScan.nextLine();

    int size = 0;

    for ( int i = 0; i < LENGTH; i++) {

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();

      System.out.print("마감일? ");
      deadline[i] = Date.valueOf(keyboardScan.nextLine());


      System.out.println("상태?");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");

      status[i] = Integer.valueOf(keyboardScan.nextLine());

      size++;

      System.out.print("담당자? ");
      owner[i] = keyboardScan.nextLine();
      System.out.println("계속 입력하시겠습니까? (y/N)");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();

    }

    keyboardScan.close();

    System.out.println("--------------------------------");

    System.out.printf("[%s]\n", project);

    for(int i = 0; i < size; i++) {
      String stateLabel = null;
      switch (status[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }

      System.out.printf("%d, %s, %s, %s, %s\n", no[i], content[i], deadline[i], stateLabel, owner[i]);
    }
>>>>>>> 6dec7bc2536ee6e78a057eda679ca131d28d86a2
  }
}
