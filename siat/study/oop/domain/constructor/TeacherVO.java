package siat.study.oop.domain.constructor;

public class TeacherVO extends PersonVO{
    public String subject;
    public TeacherVO(){
        
    }
    public TeacherVO(String name, String addr, String subject){
        super(name, addr);
        this.setSubject(subject);
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String teacherInfo(){
        return super.perInfo()+"\t 과목:"+this.getSubject();
    }
}
