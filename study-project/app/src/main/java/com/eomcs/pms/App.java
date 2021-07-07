package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.println("[회원]");
    System.out.println("번호: " );
    int number = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("이름: ");
    String str = keyboard.nextLine();

    System.out.println("이메일: ");
    String str1 = keyboard.nextLine();

    System.out.println("암호: ");
    int number1 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.println("사진: ");
    String str2 = keyboard.nextLine();

    System.out.println("전화: ");
    String str3 = keyboard.nextLine();

    System.out.println("가입일: ");
    String str4 = keyboard.nextLine();

    System.out.println("------------------------------------------------------");

    System.out.println("[회원]");
    System.out.println("번호: " + number);
    System.out.println("이름:" + str );
    System.out.println("이메일:" + str1 );
    System.out.println("암호:" + number1 );
    System.out.println("사진:" + str2 );
    System.out.println("전화:" + str3 );
    System.out.println("가입일:" + str4 );

  }
}
