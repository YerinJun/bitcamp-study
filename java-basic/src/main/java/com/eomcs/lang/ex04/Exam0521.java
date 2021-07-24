package com.eomcs.lang.ex04;

//#배열 - 배열이 필요할 때, 같은 종류의 메모리를 많이 다룰 경우
//
public class Exam0521 {
  public static void main(String[] args) {

    int a1 = 100, a2 = 90, a3 = 80, a4 = 70, a5 = 60;
    // 변수에 들어 있는 값의 합계를 구해 보자!
    int sum = a1 + a2 + a3 + a4 + a5;

    int[] arr1 = {10, 20, 30, 40, 50};
    int sum1 = 0;
    for (int i = 0; i < arr1.length; i++) {
      sum1 += arr1[i]; // sum1 = sum1 + arr1[i];
    }
    //

    int[] arr2 = new int[5];
    arr2[0] = 10;
    arr2[1] = 20;
    arr2[2] = 30;
    arr2[3] = 40;
    arr2[4] = 50;

    // 배열 변수에 들어 있는 값의 합계를 구해 보자!
    int sum2 = 0;
    //      for ( 타입 변수명 : 배열 또는 컬렉션) { 
    //              반복할 문장  
    //          }
    //
    for (int item : arr2) {
      sum2 += item; // sum2 = sum2 + item;
    }

    System.out.printf("sum 합계 : %d%nsum1 합계 : %d%nsum2 합계 : %d%n", sum, sum1, sum2);

    // 어? 배열 보다 위에 있는 코드가 편한데요?
    // => 만명의 국어 점수를 담을 변수를 선언하고 합계를 구한다고 생각해보자.
  }
}