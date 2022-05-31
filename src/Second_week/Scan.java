package Second_week;

import java.util.Scanner;

public class Scan {

  public static Student scan() {
    Scanner scan = new Scanner(System.in);

    System.out.print("이름 : ");
    String name = scan.nextLine();

    System.out.print("반 : ");
    int ban = scan.nextInt();

    System.out.print("번호 : ");
    int no = scan.nextInt();

    System.out.print("국어점수 : ");
    int kor = scan.nextInt();

    System.out.print("영어점수 : ");
    int eng = scan.nextInt();

    return new Student(name, ban, no, kor, eng);
  }
}
