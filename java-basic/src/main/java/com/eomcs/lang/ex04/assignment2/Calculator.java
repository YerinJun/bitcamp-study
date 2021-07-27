package com.eomcs.lang.ex04.assignment2;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("값1? ");
    int value1 = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("연산자(+,-,*,/)? ");
    String operator = keyboard.nextLine();
    System.out.print("값2? ");
    int value2 = keyboard.nextInt();
    keyboard.nextLine();
    keyboard.close();

    int result = 0;
    if (operator.equals("+")) {
      result = value1 + value2;
    } else if (operator.equals("-")) {
      result = value1 - value2;
    } else if (operator.equals("*")) {
      result = value1 * value2;
    } else if (operator.equals("/")) {
      result = value1 / value2;
    } else {
      System.out.println("사용할 수 없는 연산자입니다.");
      return;
    }

    System.out.printf("=> %d %s %d = %d %n", value1, operator, value2, result);
  }
}