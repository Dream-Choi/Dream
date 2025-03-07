package siat.study.oop.domain.builder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class ManagerVO extends PersonVO{
    private String dept;
    

    public String managerInfo(){
        return super.perInfo()+"\t 부서:"+this.getDept();
    }
}
