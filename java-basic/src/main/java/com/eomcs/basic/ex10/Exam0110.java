package com.eomcs.basic.ex10;
/*
public class Exam0110 {
  public static void main(String[] args) {
    long millis = System.currentTimeMillis();
    System.out.println(millis);

    java.sql.Date d = new java.sql.Date(millis);
    System.out.println(d.toString());
  }
}
 */

public class Exam0110 {
  public static void main(String[] args) {
    long millis = System.currentTimeMillis();
    System.out.println(millis);

    java.sql.Date d = new java.sql.Date(millis);
    System.out.println(d.toString());
    System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", d);
  }
}
