package First_week;

import Second_week.Student;

public class Grade {

  public static void main(String[] args) {
    Student s = new Student("홍길동", 1, 23, 4, 5);
    Student s2 = new Student("홍길동", 1, 23, 4, 5);

    System.out.println(s);
    System.out.println(s.equals(s2));
    System.out.printf("총점은 %d입니다. 평균은 %.3f 입니다.", s.getTotal(), s.getAverage());
  }
}

