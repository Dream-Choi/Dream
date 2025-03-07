package siat.study.oop.domain.constructor;

public class StudentVO extends PersonVO {
    public String stuId;

    public StudentVO(){

    }
    public StudentVO(String name, String addr, String stuId){
        super.setName(name);
        super.setAddr(addr);
        this.setStuId(stuId);
    }
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public String stuInfo(){
        return super.perInfo()+"\t 학번:"+this.getStuId();
    }
}
