package com.eomcs.lang.ex04.assignment;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 5;
    String[] name = new String[MAX_LENGTH];
    int[] korean = new int[MAX_LENGTH];
    int[] english = new int[MAX_LENGTH];
    int[] math = new int[MAX_LENGTH];
    int[] sum = new int[MAX_LENGTH];
    float[] average = new float[MAX_LENGTH];

    int size = 0;
    for(int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      System.out.print("국어? ");
      korean[i] = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("영어? ");
      english[i] = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("수학? ");
      math[i] = keyboard.nextInt();
      System.out.println();
      keyboard.nextLine();
      sum[i] = korean[i] + english[i] + math[i];
      average[i] = sum[i]/3;
      size += 1;

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0) {
        break;
      }

    }
    keyboard.close();
    System.out.println("------------------------------------");
    for (int i = 0; i < size; i++) {
      System.out.printf("%s %d %d %d %d %.1f%n", 
          name[i], korean[i], english[i], math[i], sum[i], average[i]);
    }
  }
}