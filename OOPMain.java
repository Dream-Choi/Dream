import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class OOPMain {
    /*
     OOP(Object Oriented Programming)
     -은닉화
     -상속
     -다형성
     -추상화
     */
    public static void main(String[] args) {
        TeacherVO tea = new TeacherVO("JSLIM", "광주", "자바");
        StudentVO stu=new StudentVO("박신형", "노량진", "2018");
        ManagerVO mg = new ManagerVO("이진규", "서울", "Siat");
        System.out.println(stu.perInfo());
        System.out.println(stu.stuInfo());
        System.out.println(tea.perInfo());
        System.out.println(tea.teacherInfo());
        System.out.println(mg.perInfo());
        System.out.println(mg.managerInfo());
        
    }
}
