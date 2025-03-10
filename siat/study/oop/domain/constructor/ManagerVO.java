package siat.study.oop.domain.constructor;

public class ManagerVO extends PersonVO { 

    private String dept;

    public ManagerVO() {
    }

    public ManagerVO(String name, String addr, String dept) {
        super(name, addr);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    } 

    public String managerInfo() {
        return super.perInfo()+"\t 부서 : "+this.getDept() ; 
    }

    public String perInfo() {
        return super.perInfo()+"\t 부서 : "+this.getDept() ; 
    }
     
}
