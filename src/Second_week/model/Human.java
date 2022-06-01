package Second_week.model;

import java.util.Objects;

public class Human extends AbsCls implements InterfaceObject {

  private String name;
  private int ban;

  public Human(String name, int ban) {

    this.name = name;
    this.ban = ban;
  }


  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getBan() {
    return ban;
  }

  public void setBan(int ban) {
    this.ban = ban;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    } else {
      Human that = (Human) obj;
      return Objects.equals(name, that.name) && Objects.equals(ban, that.ban);
    }
  }
}

// 선생에 똑같이 equals 구현
