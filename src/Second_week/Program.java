package Second_week;

import Second_week.model.Student;
import Second_week.model.Teacher;
import Second_week.service.SchoolService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Program {

  // 무제한 배열 라이브러리 List
  // 1번을 입력하면 학생 정보를 입력하고 2번을 입력하면 모든 학생 정보를 출력한다. 숙제!
  // 3번을 입력하면 프로그램을 종료한다. view : 1, 2, 3 선택 하세요.
  // 반 평균 / 반 총점

  public static void main(String[] args) {

    SchoolService service = new SchoolService();

    List<Student> ban = new ArrayList<>();
    List<Teacher> teachers = new ArrayList<>();

    try (FileInputStream fis = new FileInputStream("School");
        ObjectInputStream ois = new ObjectInputStream(fis)) {

      ban = (List<Student>) ois.readObject();
      teachers = (List<Teacher>) ois.readObject();

    } catch (FileNotFoundException e) {

    } catch (IOException e) {
      e.printStackTrace();

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    loop_1:
    while (true) {
      int selectT = service.input("1번 [선생정보입력] 2번 [선생님 반 선택]");
      switch (selectT) {
        case 1:
          System.out.println("선생님을 등록합니다.");
          Teacher th = Teacher.build(service.input("반 : "));
          teachers.add(th);
          System.out.println("선생님 등록이 완료되었습니다.");
          break;
        case 2:
          service.setBan(service.selectBan(teachers));
          break;
      }
      if (service.getBan() == 0) {
        System.out.println("반이 없습니다.");
        continue;
      }

      loop_2:
      while (true) {
        int select = service.input("1번 [학생정보입력] 2번 [모든학생정보출력] 3번 [반총점] 4번 [반평균] 5번 [종료]");

        switch (select) {
          case 1:
            service.addStudent(ban);
            break;
          case 2:
            service.updateStudent(ban);
            break;
          case 3:
            service.banSum(ban);
            break;
          case 4:
            service.banAvg(ban);
            break;
          case 5:
            break loop_2; // 반목문 종료
        }
      }
      int next = service.input("다른반을 선택하시겠습니까? 1번 : 반선택 , 2번 저장 후 종료");
      if (next == 2) {
        try (FileOutputStream fos = new FileOutputStream("School");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
          oos.writeObject(ban);
          oos.writeObject(teachers);
        } catch (IOException e) {
          e.printStackTrace();
        }
        break loop_1;
      }

    }
  }
}

// 1. 토탈과 같이 반의 평균을 구하시오.

// 2. 학생 정보를 가져와 수정하기. (2번 입력 후 학생 정보 확인 후 1==확인 2==수정(수정번호를입력하시오) 수정
// 3. 학생 정보를 입력할때 같은반 & 같은 번호 입력시 다른 번호 유도하기

//new main에서 스위치문 케이스를 한줄씩 만들기

// 해당 프로그램은 선생님 계정으로 로그인한다. (지정된 반만 확인하기)
// 상속

// 선생 리스트 작성 / 프로그램 실행시 이름 / 반번호 로그인하기

