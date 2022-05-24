package Second_week;

import java.util.Scanner;

public class Scan {

  public static Student scan() {
    Scanner scan = new Scanner(System.in);
    Student s = new Student();

    System.out.print("이름 : ");
    s.setName(scan.nextLine());
    System.out.print("반 : ");
    s.setBan(scan.nextInt());
    System.out.print("번호 : ");
    s.setNo(scan.nextInt());
    System.out.print("국어점수 : ");
    s.setKor(scan.nextInt());
    System.out.print("영어점수 : ");
    s.setEng(scan.nextInt());

    return s;
  }
}
