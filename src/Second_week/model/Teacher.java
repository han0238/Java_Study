package Second_week.model;

public class Teacher extends Human {


  private String gender;

  public Teacher(String name, String gender, int ban) {
    super(name, ban);
    this.gender = gender;

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