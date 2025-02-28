public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        //인스턴스 소유의 변수의 값을 할당
        car.maker="Audi";
        car.model="A8";
        car.price=150000000;
        System.out.println("차 제조사:"+car.maker);
        System.out.println("차 모델:"+car.model);
        System.out.println("차 가격:"+car.price);

        //인스턴스 소유의 메서드 호출하기
        car.drive();
        String result=car.repaire();
        System.out.println("반환값 출력:"+result);
        car.performence("고급휘발유");
        result=car.speed(200);
        System.out.println("반환값 출력:"+result);
    }
}
