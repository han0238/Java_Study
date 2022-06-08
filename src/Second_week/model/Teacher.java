package Second_week.model;

import java.io.Serializable;
import java.util.Scanner;

public class Teacher extends Human implements Serializable {

  private String gender;

  public Teacher(String name, int ban, String gender) {
    super(name, ban);
    this.gender = gender;

  }

  public static Teacher build(int ban) {
    Scanner scan = new Scanner(System.in);
    String name = null;
    String gender = null;

    while (true) {
      try {
        System.out.print("이름 : ");
        name = scan.next();

        System.out.print("성별 (남 or 여) : ");
        gender = scan.next();

        break;
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("오류가 발생되었습니다. 처음부터 다시 입력해 주세요.");
      }
    }
    return new Teacher(name, ban, gender);
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
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
      return gender == ((Teacher) obj).gender;
    } else {
      return false;
    }
  }


  @Override
  public String toString() {
    return "Teacher{ name=" + getName() + ", ban=" + getBan() +
        ", gender='" + gender + '\'' +
        '}';
  }
}