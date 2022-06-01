package Second_week.service;

import Second_week.model.Student;
import Second_week.model.Teacher;
import java.util.List;
import java.util.Scanner;

public class SchoolService {

  private static Scanner SCANNER = new Scanner(System.in);
  private int banNumber;

  public int getBan() {
    return banNumber;
  }

  public void setBan(int ban) {
    this.banNumber = ban;
  }

  public int selectBan(List<Teacher> ban) {
    Teacher tc = tOutput(ban, input("반을 입력하세요."));
    return tc != null ? tc.getBan() : 0;
  }

  public void addStudent(List<Student> ban) {
    System.out.println(ban.size() + 1 + "번 학생 정보");
    ban.add(Student.build(banNumber));
  }

  public void updateStudent(List<Student> ban) {
    int count = output(ban, banNumber);
    while (count > 0) {
      int edit = input("[1] 수정 [2] 나가기");
      if (edit == 1) {
        studentEdit(ban, input("수정할 번호를 입력하세요."));
      } else if (edit == 2) {
        break;
      }
    }
  }

  public void banSum(List<Student> ban) {
    int total = banTotal(ban, banNumber);
    System.out.println(total);
  }

  public void banAvg(List<Student> ban) {
    for (int i = 0; i < ban.size(); i++) {
      if (banNumber == ban.get(i).getBan()) {
        System.out.println();
      }
    }
    System.out.println(banTotal(ban, banNumber) / (float) ban.size());
  }

  public int input(String i) {
    System.out.println(i);
    int result = SCANNER.nextInt();
    SCANNER.reset();
    return result;
  }

  public Teacher tOutput(List<Teacher> teachers, int input) {

    for (int i = 0; i < teachers.size(); i++) {
      if (input == teachers.get(i).getBan()) {
        System.out.println(teachers.get(i));
        return teachers.get(i);
      }
    }
    return null;
  }

  public int output(List<Student> students, int ban) {
    int count = 0;

    for (int i = 0; i < students.size(); i++) {
      if (ban == students.get(i).getBan()) {
        count++;
        System.out.println(students.get(i));
      }
    }
    return count;
  }

  public void studentEdit(List<Student> ban, int check) {

    for (int i = 0; i < ban.size(); i++) {
      if (check == ban.get(i).getNo()) {
        boolean exp = true;
        while (exp) {
          try {
            Student target = ban.get(i);
//            target.setName(null);
//            target.getName().toString();
//            예외 발생
            System.out.println(target);
            System.out.print("이름 : ");
            target.setName(SCANNER.next());
//            System.out.print("반 : ");
            target.setBan(banNumber);
            System.out.print("국어 : ");
            target.setKor(SCANNER.nextInt());
            System.out.print("영어 : ");
            target.setEng(SCANNER.nextInt());
            exp = false;
          } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생!!");
          }
        }
      }
    }
  }

  public int banTotal(List<Student> ban, int check) {
    int result = 0;

    for (int i = 0; i < ban.size(); i++) {
      if (check == ban.get(i).getBan()) {
        result += ban.get(i).getEng() + ban.get(i).getKor();
      }
    }
    return result;
  }
}
