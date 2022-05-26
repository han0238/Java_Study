package Second_week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {


  public static void main(String[] args) {
    List<Student> ban = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Student first = new Student("김", 1, 1, 40, 50);
    //Student second = new Student("이", 1, 2, 45, 90);
    ban.add(first);
    //ban.add(second);

    int select = 0;
    int check = 0;

    while (true) {
      System.out.println("1번 [학생정보입력] 2번 [모든학생정보출력] 3번 [반총점] 4번 [반평균] 5번 [종료]");
      select = scan.nextInt();

      if (select == 1) {
        System.out.println(ban.size() + 1 + "번 학생 정보");
        ban.add(Scan.scan());
      }
      if (select == 2) {
        output(ban);
      }
      if (select == 3) {
        System.out.println("반을 입력하세요.");
        check = scan.nextInt();
        int total = banTotal(ban, check);
        System.out.println(total == 0 ? "반이 없습니다." : total);
      }
      if (select == 4) {
        System.out.println("반을 입력하세요.");
        check = scan.nextInt();
        System.out.println(banAverage(ban, check));
      }
      if (select == 5) {
        break;
      }
    }

    // 무제한 배열 라이브러리 List
    // 1번을 입력하면 학생 정보를 입력하고 2번을 입력하면 모든 학생 정보를 출력한다. 숙제!
    // 3번을 입력하면 프로그램을 종료한다. view : 1, 2, 3 선택 하세요.
    // 반 평균 / 반 총점
  }

  public static void output(List<Student> ban) {
    for (int i = 0; i < ban.size(); i++) {
      System.out.println(ban.get(i));
    }
  }


  public static int banTotal(List<Student> ban, int check) {
    int result = 0;

    for (int i = 0; i < ban.size(); i++) {
      if (check == ban.get(i).getBan()) {
        result += ban.get(i).getEng() + ban.get(i).getKor();
      }
    }
    return result;
  }

  public static float banAverage(List<Student> ban, int check) {
    float bann = ban.size();
    return banTotal(ban, check) / bann;
  }
}

// 1. 토탈과 같이 반의 평균을  구하시오.
// 2. 학생 정보를 가져와 수정하기.
// 3. 학생 정보를 입력할때 같은반 & 같은 번호 입력시 다른 번호 유도하기
