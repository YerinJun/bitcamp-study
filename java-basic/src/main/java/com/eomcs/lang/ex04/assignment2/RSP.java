package com.eomcs.lang.ex04.assignment2;

import java.util.Scanner;

public class RSP {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("주먹,가위,보?! ");
    String user = keyboard.nextLine();
    keyboard.close();

    if (user.equals("가위") || user.equals("주먹") || user.equals("보")) {
      System.out.println("사용자: " + user );
    } else {
      System.out.println("주먹,가위,보 중에서 하나를 입력해주세요.");
      return;
    }

    int random = (int)(Math.random()*3);
    String computer = String.valueOf(random);
    if (random == 0) {
      computer = "가위";
    } else if (random == 1) {
      computer = "주먹";
    } else  {
      computer = "보";
    }
    System.out.println("컴퓨터: " + computer);


    if (user.equals("가위")) {
      if (computer.equals("가위")) {
        System.out.println("비겼습니다.");
      } else if (computer.equals("주먹")) {
        System.out.println("졌습니다.");
      } else {
        System.out.println("이겼습니다.");
        return;
      }
    }
    if (user.equals("주먹")) {
      if (computer.equals("주먹")) {
        System.out.println("비겼습니다.");
      } else if (computer.equals("보")) {
        System.out.println("졌습니다.");
      } else {
        System.out.println("이겼습니다.");
        return;
      }
    }
    if (user.equals("보")) {
      if (computer.equals("보")) {
        System.out.println("비겼습니다.");
      } else if (computer.equals("가위")) {
        System.out.println("졌습니다.");
      } else {
        System.out.println("이겼습니다.");
        return;
      }
    }
  }
}



