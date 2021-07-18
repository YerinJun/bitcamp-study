package com.eomcs.lang.ex03;

//# 부동소수점 리터럴 - 최소값과 최대값

public class Exam0330 {
  public static void main(String[] args) {

    //## 4바이트 부동소수점의 최대값과 최소값
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);
    System.out.println(Float.MAX_EXPONENT);
    System.out.println(Float.MIN_EXPONENT);
    System.out.println(Float.MIN_NORMAL);
    System.out.println();

    //## 8바이트 부동소수점의 최대값과 최소값
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);
    System.out.println(Double.MAX_EXPONENT);
    System.out.println(Double.MIN_EXPONENT);
    System.out.println(Double.MIN_NORMAL);
    System.out.println();

    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);
  }
}
