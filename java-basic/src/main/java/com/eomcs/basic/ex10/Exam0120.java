package com.eomcs.basic.ex10;

public class Exam0120 {
  public static void main(String[] args) {
<<<<<<< HEAD
    long millis = System.currentTimeMillis();
    System.out.println(millis);

    java.sql.Date d = new java.sql.Date(millis);
    System.out.println(d.toString());
  }
}
=======
    java.util.Date d = new java.util.Date(); // Date 객체를 만드는 순간의 시각을 저장해 둔다.
    System.out.println(d.toString());
    System.out.printf("%tY-%tm-%td\n", d, d, d);
    System.out.printf("%tY-%1$tm-%1$td", d);
  }
}
>>>>>>> 6dec7bc2536ee6e78a057eda679ca131d28d86a2
