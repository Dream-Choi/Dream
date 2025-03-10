package siat.study.oop.domain.constructor;

public class TeacherVO extends PersonVO {

    private String subject ;

    public TeacherVO() {
    }

    public TeacherVO(String name, String addr, String subject) {
        super(name, addr);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String teaInfo() {
        return super.perInfo()+"\t 과목 : "+this.getSubject(); 
    }

    public String perInfo() {
        return super.perInfo()+"\t 과목 : "+this.getSubject(); 
    }
    
}
