package Second_week;

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

}

