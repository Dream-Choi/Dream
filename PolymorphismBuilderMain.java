import lombok.Builder;
import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.service.PolymorphismBuilderService;
import siat.study.oop.util.EnumOop;

public class PolymorphismBuilderMain {
@Builder
    public static void main(String[] args) {
        PolymorphismBuilderService service = PolymorphismBuilderService.builder().perAry(new PersonVO[10]).build();
        service.makePerson(EnumOop.TEA, "임정섭", "서울", "JAVA");
        service.makePerson(EnumOop.STU, "Park", "Seoul", "2018");
        service.makePerson(EnumOop.EMP, "Lee", "Seoul", "Siat");
        System.out.println(">>>> 전체 출력"); 
        PersonVO [] ary = service.getPerson() ; 
        for(int idx=0 ; idx < ary.length ; idx++) {
            PersonVO per = ary[idx] ;
            if(per!=null){
            System.out.println( per.perInfo() ); 
            }
        }
        System.out.println("Quiz");
        System.out.println("사용자 검색");
        PersonVO per =service.findPerson("박신형");
        if (per==null){
            System.out.println("못찾음");
        }else{
            System.out.println(per.perInfo());
        }
     }
}
