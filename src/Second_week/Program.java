package Second_week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {


  public static void main(String[] args) {

    List<Student> ban = new ArrayList<>();
    Student first = new Student("김", 1, 1, 40, 50); // 더미
    ban.add(first);

    loop:
    while (true) {
      int select = input("1번 [학생정보입력] 2번 [모든학생정보출력] 3번 [반총점] 4번 [반평균] 5번 [종료]");

      switch (select) {
        case 1:
          one(ban);
          break;
        case 2:
          two(ban);
          break;
        case 3:
          three(ban);
          break;
        case 4:
          four(ban);
          break;
        case 5:
          break loop; // 반목문 종료
      }
    }
  }
  // 무제한 배열 라이브러리 List
  // 1번을 입력하면 학생 정보를 입력하고 2번을 입력하면 모든 학생 정보를 출력한다. 숙제!
  // 3번을 입력하면 프로그램을 종료한다. view : 1, 2, 3 선택 하세요.
  // 반 평균 / 반 총점

  public static void one(List<Student> ban) {
    System.out.println(ban.size() + 1 + "번 학생 정보");
    ban.add(Scan.scan());
  }

  public static void two(List<Student> ban) {
    int banCheck = output(ban, input("반을 입력하세요"));
    System.out.println(banCheck == 0 ? "반이 없습니다." : "");
    while (true) {
      int edit = input("[1] 수정 [2] 나가기");
      if (edit == 1) {
        studentEdit(ban, input("수정할 번호를 입력하세요."));
      } else if (edit == 2) {
        break;
      }
    }
  }

  public static void three(List<Student> ban) {
    int total = banTotal(ban, input("반을 입력하세요."));
    System.out.println(total == 0 ? "반이 없습니다." : total);
  }

  public static void four(List<Student> ban) {
    float average = banAverage(ban, input("반을 입력하세요."));
    System.out.println(average == 0 ? "반이 없습니다." : average);
  }

  public static int input(String i) {
    System.out.println(i);
    return new Scanner(System.in).nextInt();
  }


  public static int output(List<Student> students, int input) {
    int count = 0;

    for (int i = 0; i < students.size(); i++) {
      if (input == students.get(i).getBan()) {
        count++;
        System.out.println(students.get(i));
      }
    }
    return count;
  }

  public static void studentEdit(List<Student> ban, int check) {

    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < ban.size(); i++) {
      if (check == ban.get(i).getNo()) {
        Student target = ban.get(i);
        System.out.println(target);
        System.out.print("이름 : ");
        target.setName(scan.nextLine());
        System.out.print("반 : ");
        target.setBan(scan.nextInt());
        System.out.print("국어 : ");
        target.setKor(scan.nextInt());
        System.out.print("영어 : ");
        target.setEng(scan.nextInt());
      }
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
    float banAv = ban.size();

    for (int i = 0; i < ban.size(); i++) {
      if (check == ban.get(i).getBan()) {
        System.out.println();
      }
    }
    return banTotal(ban, check) / banAv;
  }
}

// 1. 토탈과 같이 반의 평균을 구하시오.

// 2. 학생 정보를 가져와 수정하기. (2번 입력 후 학생 정보 확인 후 1==확인 2==수정(수정번호를입력하시오) 수정
// 3. 학생 정보를 입력할때 같은반 & 같은 번호 입력시 다른 번호 유도하기

//new main에서 스위치문 케이스를 한줄씩 만들기