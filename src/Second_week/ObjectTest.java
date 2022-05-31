package Second_week;

public class ObjectTest {

  public static void main(String[] args) {
    Teacher t = new Teacher(null, null, 0);
    Student s = new Student("qwer", 0, 0, 0, 0);
    Human h = new Human(null, 0);

    if (t instanceof Teacher) {
      System.out.println("티쳐");
    }

    if (s instanceof Student) {
      System.out.println("학상");
    }

    if (t instanceof Human) {
      System.out.println("선생은 사람이다.");
    }

    if (s instanceof Human) {
      System.out.println("학생은 사람이다.");
    }

    if (h instanceof Teacher) {
      System.out.println("사람은 선생이다.");
    }

    if (h instanceof Student) {
      System.out.println("사람은 학생이다.");
    }

    if (s.equals(new Teacher("qwer", "남", 0))) {
      System.out.println("aa");
    }

  }
}
