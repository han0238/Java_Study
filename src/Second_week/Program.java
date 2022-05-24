package Second_week;

import java.util.ArrayList;
import java.util.List;

public class Program {

  public static void main(String[] args) {
    List<Student> ban = new ArrayList<>();
    // 무제한 배열 라이브러리 List
    // 1번을 입력하면 학생 정보를 입력하고 2번을 입력하면 모든 학생 정보를 출력한다. 숙제!
    // 3번을 입력하면 프로그램을 종료한다. view : 1, 2, 3 선택 하세요.
    // 힌트 무한반복문 필요

    for (int i = 0; i < ban.size(); i++) {
      System.out.println(i + 1 + "번 학생 정보");
      ban.add(Scan.scan());
    }

    for (int i = 0; i < ban.size(); i++) {
      System.out.println(ban.get(i));
    }
  }
}
