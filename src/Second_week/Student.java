package Second_week;

public class Student {

  private String name = "";
  private int ban = 0;
  private int no = 0;
  private int kor = 0;
  private int eng = 0;

  // 내가 정의한 생성자가 1개라도 있으면 JVM이 기본생성자를 생성해 주지 않는다.
  public Student(String name, int ban, int no, int kor, int eng) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
  }

  public Student() {

  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBan() {
    return ban;
  }

  public void setBan(int ban) {
    this.ban = ban;
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
        "name='" + name + '\'' +
        ", ban=" + ban +
        ", no=" + no +
        ", kor=" + kor +
        ", eng=" + eng +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student target = (Student) obj;
      if (target.name.equals(this.name)
          && target.ban == this.ban
          && target.no == this.no) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }

  }

}