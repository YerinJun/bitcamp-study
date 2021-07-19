package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler3 {
  static final int MAX_LENGTH = 5;

  // Member 인스턴스의 주소를 저장할 레퍼런스를 3개 생성한다.
  static Board[] boards = new Board[MAX_LENGTH];
  static int size = 0;

  // 다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void add() {
    System.out.println("[게시글 등록3]");

    // 새 회원 정보를 담을 변수를 준비한다.
    // 낱 개의 변수가 아니라 Member에 정의된 대로 묶음 변수를 만든다.
    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());
    board.viewCount = Prompt.inputInt("조회수? ");
    //board.tel = Prompt.inputString("전화? ");

    boards[size++] = board;
  }

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %d, %s\n", 
          boards[i].no, 
          boards[i].title, 
          boards[i].content, 
          boards[i].writer,
          boards[i].registeredDate,
          boards[i].viewCount);
    }
  }
}
