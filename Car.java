public class Car {
    // 클래스의 구성요소 변수+메서드+생성자
    // 변수 선언
    //[접근지정자] 자료형 변수명
    // 접근지정자:public, private
    public String maker, model;
    public int price;
    //메서드 선언
    //[접근지정자]반환타입 메서드명([매개변수]){ }

    public void drive(){
        System.out.println("매개변수 없고 반환타입도 없다.");
    }
    public String repaire(){
        System.out.println("매개변수 없고 반환타입 존재");
        return "차량수리완료";
    }
    public void performence(String fuel){
        System.out.println("매개변수 있고 반환타입이 없다.");
        System.out.println(fuel+"로 성능향상됨.");

    }
    public String speed(int speed){
        System.out.println("매개변수 있고 반환타입이 있다.");
        System.out.println("스피드는:"+speed);
        return "과속중";
    }
}
