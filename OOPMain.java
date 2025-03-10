import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class OOPMain {
    /*
     OOP(Object Oriented Programming)
     -은닉화
     -상속
     -다형성(타입, 매개변수. 메서드)
     -추상화
     */
    public static void main(String[] args) {
        TeacherVO tea = new TeacherVO("JSLIM", "광주", "자바");
        StudentVO stu=new StudentVO("박신형", "노량진", "2018");
        ManagerVO mg = new ManagerVO("이진규", "서울", "Siat");
        System.out.println(stu.perInfo());
        System.out.println(stu.stuInfo());
        System.out.println(tea.perInfo());
        System.out.println(tea.teaInfo());
        System.out.println(mg.perInfo());
        System.out.println(mg.managerInfo());
        /////////////////
        PersonVO stu01=new StudentVO("Dream", "Incheon", "2018");
        System.out.println(stu01.perInfo());
        System.out.println(((StudentVO)stu01).stuInfo());
        PersonVO tea01=new TeacherVO("JSLIM", "광주", "자바");
        System.out.println(tea01.perInfo());
        System.out.println(((TeacherVO)tea01).teaInfo());
        PersonVO mg01=new ManagerVO("이진규", "서울", "Siat");
        System.out.println(mg01.perInfo());
        System.out.println(((ManagerVO)mg01).managerInfo());
        ///// 다형성을 사용하는 이유?
        System.out.println("-----------다형성");
        PersonVO [] perAry = new PersonVO[3];
        perAry[0]=stu;
        perAry[1]=tea;
        perAry[2]=mg;
        for(int i=0;i<perAry.length;i++){
            PersonVO per =perAry[i];
            // instanceof 연산자:객체타입을 비교해주는 연산자
            if(per instanceof StudentVO){
                System.out.println(((StudentVO)per).stuInfo());
            }
            if(per instanceof TeacherVO){
                System.out.println(((TeacherVO)per).teaInfo());
            }
            if(per instanceof ManagerVO){
                System.out.println(((ManagerVO)per).managerInfo());
            }
        }
    }
}
