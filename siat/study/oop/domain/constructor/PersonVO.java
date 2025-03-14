package siat.study.oop.domain.constructor;

public class PersonVO {
    //공통의 요소
    private String name;
    private String addr;

    //각각의 특징적인 요소
    
    public PersonVO(){

    }
    
    public PersonVO(String name, String addr) {
        this.name = name;
        this.addr = addr;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
   
    public String getAddr() {
        return addr;
    }
    public String perInfo(){
        return "이름:"+this.getName()+"\t 주소:"+this.getAddr();
    }

    @Override
    public String toString() {
        return "PersonVO [이름:" + name + ", 주소:" + addr + "]";
    }
    
}
