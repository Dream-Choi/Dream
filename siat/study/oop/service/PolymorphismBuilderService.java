package siat.study.oop.service;

import lombok.experimental.SuperBuilder;
import siat.study.oop.domain.builder.ManagerVO;
import siat.study.oop.domain.builder.StudentVO;
import siat.study.oop.domain.builder.TeacherVO;
import siat.study.oop.domain.builder.PersonVO;
import siat.study.oop.util.EnumOop;

@SuperBuilder

public class PolymorphismBuilderService {
    private PersonVO[] perAry;
    private int idx;
    public PolymorphismBuilderService(){
        perAry = new PersonVO[10];
    }
    public void makePerson(EnumOop division, String name, String addr, String comm){
        switch (division.getDivision()) {
            case "강사":
                TeacherVO tea = TeacherVO.builder()
                                         .name(name)
                                         .addr(addr)
                                         .subject(comm)
                                         .build();
                setPerson(tea);                
                break;
            case "학생":
                StudentVO stu =StudentVO.builder()
                                        .name(name)
                                        .addr(addr)
                                        .stuId(comm)
                                        .build();
                setPerson(stu);
                break;
            case "매니저":
                ManagerVO emp= ManagerVO.builder()
                                        .name(name)
                                        .addr(addr)
                                        .dept(comm)
                                        .build();
                setPerson(emp);
                break;
        }
    }
    public void setPerson(PersonVO person){
        perAry[idx++]=person;
    }
    public PersonVO[] getPerson(){
        return perAry;
    }
    public PersonVO findPerson(String name){
        PersonVO per =null;
        for(int i=0;i<perAry.length;i++){
            per =perAry[i];
            if(per!=null){
                if(per.getName().equals(name)){
                    return per;
                }
                
            }
        }
        return per;
    }
}
