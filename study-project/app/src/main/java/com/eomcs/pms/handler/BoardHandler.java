package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  // 모든 게시판의 최대 배열 개수가 같기 때문에 다음 변수는 
  // 그냥 static 필드로 남겨둔다.
  static final int MAX_LENGTH = 5;

  // 게시판 마다 따로 관리해야 하기 때문에 인스턴스 필드로 전환한다.
  // => static 옵션을 뺀다.
  Board[] boards = new Board[MAX_LENGTH];
  int size = 0;

  // BoardHandler 설계도에 따라 만든 변수(boards, size)를 다룰 수 있도록
  // 파라미터로 인스턴스 주소를 받는다.
  //
  public static void add(BoardHandler that) {
    System.out.println("[새 게시글]");

    // 새 회원 정보를 담을 변수를 준비한다.
    // 낱 개의 변수가 아니라 Member에 정의된 대로 묶음 변수를 만든다.
    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());
    board.viewCount = Prompt.inputInt("조회수? ");
    board.likes = Prompt.inputInt("좋아요 수? ");

    that.boards[that.size++] = board;
  }

  //BoardHandler 설계도에 따라 만든 변수(boards, size)를 다룰 수 있도록
  // 파라미터로 인스턴스 주소를 받는다.
  //
  public static void list(BoardHandler that) {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < that.size; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %d, %d\n", 
          that.boards[i].no, 
          that.boards[i].title, 
          that.boards[i].content, 
          that.boards[i].writer,
          that.boards[i].registeredDate,
          that.boards[i].viewCount,
          that.boards[i].likes);
    }
  }
}
