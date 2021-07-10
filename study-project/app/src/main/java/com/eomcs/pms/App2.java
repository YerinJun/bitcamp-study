package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");
<<<<<<< HEAD

    Scanner keyboardScan = new Scanner(System.in);

    System.out.print("번호? ");
    int no = keyboardScan.nextInt();
    keyboardScan.nextLine(); // 번호 뒤에 남아 있는 줄바꿈 코드를 제거한다.

    System.out.print("프로젝트명? ");
    String title = keyboardScan.nextLine();

    System.out.print("내용? ");
    String content = keyboardScan.nextLine();

    System.out.print("시작일? ");
    Date startDate = Date.valueOf(keyboardScan.nextLine());

    System.out.print("종료일? ");
    Date endDate = Date.valueOf(keyboardScan.nextLine());

    System.out.print("만든이? ");
    String owner = keyboardScan.nextLine();

    System.out.print("팀원? ");
    String members = keyboardScan.nextLine();

    keyboardScan.close();

    System.out.println("--------------------------------");

    System.out.printf("번호: %d\n", no);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", startDate);
    System.out.printf("종료일: %s\n", endDate);
    System.out.printf("만든이: %s\n", owner);
    System.out.printf("팀원: %s\n", members);
=======
    Scanner keyboardScan = new Scanner(System.in);

    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];


    int size = 0;

    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.valueOf(keyboardScan.nextLine());

      System.out.print("프로젝트명? ");
      title[i] = keyboardScan.nextLine();

      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyboardScan.nextLine();

      System.out.print("팀원? ");
      members[i] = keyboardScan.nextLine();

      size++;
      System.out.println();
      System.out.print("계속 입력하시겠습니까? (y/N)");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }
    keyboardScan.close();

    System.out.println("--------------------------------");

    for (int i =0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s", 
          no[i], title[i], content[i], startDate[i], endDate[i], owner[i], members[i]);
    }
>>>>>>> 6dec7bc2536ee6e78a057eda679ca131d28d86a2
  }
}

