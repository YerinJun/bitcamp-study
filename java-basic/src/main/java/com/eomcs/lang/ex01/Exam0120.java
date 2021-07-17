package com.eomcs.lang.ex01;

//# 클래스 블록과 컴파일 2
//- 한 소스 파일에 여러 개의 클래스 블록이 있을 경우 각 블록 당 한 개의 클래스 파일(.class)이 생성된다.

class A {
  public static void main(String[] args) {
    System.out.println(4564);
  }
}

class B {
  public static void main(String[] args) {
    System.out.println("dfsfs");
  }
}

class C {
  public static void main(String[] args) {
    System.out.println(5 + 4 + 3);
  }
}

//## 실습
//1) 컴파일하기
//- $ javac -d bin/main -encoding utf-8 src/main/java/com/eomcs/lang/ex01/Exam0120.java
//// 컴파일은 소스 파일 이름으로 하고 실행 시에는 클래스명으로 실행한다.
//- 자바 컴파일러는 클래스 블록 단위로 컴파일을 수행한다.
//
//2) 생성된 클래스 파일 확인하기
//- bin/main/com/eomcs/lang/ex01 디렉토리에 A.class, B.class, C.class 파일이 생성된다.
