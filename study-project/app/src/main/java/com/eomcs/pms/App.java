package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

<<<<<<< HEAD
=======
// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3) 배열을 사용하여 여러 개의 값을 다루기
// - 배열을 사용하면 간단하게 여러 개의 변수를 선언할 수 있다.
// 4) 반복문을 사용하여 여러 개의 값을 다루기
// - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
// 5) 배열 개수를 변수에서 관리하기
// - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다.
// 6) 상수를 사용하여 초기 값을 변경하지 못하게 막기
// - 변수는 중간에 값을 바꿀 수 있기 때문에 값을 바꾸지 말아야 하는 경우
//   상수로 선언한다.
>>>>>>> 6dec7bc2536ee6e78a057eda679ca131d28d86a2
public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

<<<<<<< HEAD
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
=======
    Scanner keyboardScan = new Scanner(System.in);

    // 최대 입력 개수
    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int size = 0;

    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();

      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();

      registeredDate[i] = new java.sql.Date(System.currentTimeMillis());

      size++;
      System.out.println(); // 빈 줄 출력

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println(); // 빈 줄 출력
    }

    keyboardScan.close();

    System.out.println("--------------------------------");

    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
>>>>>>> 6dec7bc2536ee6e78a057eda679ca131d28d86a2
  }
}
