package siat.study.oop.domain.constructor;

public class StudentVO extends PersonVO {
    
    private String stuId ;

    public StudentVO(){
    }
    public StudentVO(String name, String addr, String stuId){
        super(name, addr) ;
        this.setStuId(stuId);  
    }
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String stuInfo() {
        return super.perInfo()+"\t 학번 : "+this.getStuId() ; 
    }

    public String perInfo() {
        return super.perInfo()+"\t 학번 : "+this.getStuId() ; 
    }

    

}

