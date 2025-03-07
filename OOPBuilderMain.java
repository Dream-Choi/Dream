import siat.study.oop.domain.builder.ManagerVO;
import siat.study.oop.domain.builder.StudentVO;
import siat.study.oop.domain.builder.TeacherVO;

public class OOPBuilderMain {
    public static void main(String[] args) {
        /*
         @bulider
         @superBulider(상속관계에서 생성자에게 상속받은 필드에 대한 접근)
         */
        StudentVO stu= StudentVO.builder().name("최드림").addr("인천").stuId("2018").build();
        ManagerVO mg = ManagerVO.builder().name("이진규").addr("서울").dept("Siat").build();
        TeacherVO tea =TeacherVO.builder().name("jslim").addr("광주").subject("JAVA").build();
        System.out.println(stu.perInfo());
        System.out.println(stu.stuInfo());
        System.out.println(mg.perInfo());
        System.out.println(mg.managerInfo());
        System.out.println(tea.perInfo());
        System.out.println(tea.teacherInfo());
    }
}
