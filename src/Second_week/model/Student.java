package Second_week.model;

import java.util.Scanner;

public class Student extends Human {

  private int no;
  private int kor;
  private int eng;

  // 내가 정의한 생성자가 1개라도 있으면 JVM이 기본생성자를 생성해 주지 않는다.
  private Student(String name, int ban, int no, int kor, int eng) {
    super(name, ban);
    this.no = no;
    this.kor = kor;
    this.eng = eng;
  }

  public static Student build(int ban) {
    Scanner scan = new Scanner(System.in);
    String name;
    int no;
    int kor;
    int eng;

    while (true) {
      try {
        System.out.print("이름 : ");
        name = scan.next();

        System.out.print("번호 : ");
        no = scan.nextInt();

        System.out.print("국어점수 : ");
        kor = scan.nextInt();

        System.out.print("영어점수 : ");
        eng = scan.nextInt();

        break;
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("오류가 발생되었습니다. 처음부터 다시 입력해 주세요.");
      }
    }
    return new Student(name, ban, no, kor, eng);
  }


  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getTotal() {
    return kor + eng;
  }

  public float getAverage() {
    return getTotal() / 2F;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + getName() + '\'' +
        ", ban=" + getBan() +
        ", no=" + no +
        ", kor=" + kor +
        ", eng=" + eng +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    if (super.equals(obj)) {
      return no == ((Student) obj).no;
    } else {
      return false;
    }
  }
}
