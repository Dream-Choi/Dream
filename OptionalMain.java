import java.util.List;
/*
 Optional?
 -어떤 메서드가 null을 반환할지 확신 못하거나, null 처리를 놓쳐서 발생하는 예외를 피할수 있는 것
 -예외처리를 더 쉽게 할수 있어 코드의 가독성이 높아지고, 유지보수도 편리하다.
 -ver 8
 - Spring Java Persistance API
 주의사항)
 -사용의도에 맞게 사용해야함.(null 할당 x)
 -메서드의 반환 타입으로 사용(전역변수 타입x, 매개변수도 안됨)
 -기본타입(Primitive type)->Wrapper Class사용말고 원시타입 용도로 만들어진 클래스를 권장
 */
import java.util.Optional;

import siat.study.oop.domain.constructor.PersonVO;


public class OptionalMain {
    public static void main(String[] args) {
        //System.out.println("main start");
        OptionalApp app= new OptionalApp();
        Optional<PersonVO> result =app.findById(1L);
        if (result.isPresent()) {
            System.out.println(result.get().perInfo());
            
        }
        System.out.println("-----");
        Optional<List<PersonVO>> list=app.getUser();
        if(list.isPresent()){
            list.get().stream().forEach(System.out::println);
        }
        //List<String> lst= app.getStr();
        //System.out.println(lst.size());
        //System.out.println("main end");
        System.out.println("-----생성방법");
        Optional<String> empty=Optional.empty();
        System.out.println(empty);
        Optional<String> opt= Optional.of("siat");
        
        Optional<String> optNull= Optional.ofNullable(null);
        System.out.println(optNull);
        System.out.println("------메서드 사용");
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
        //opt.ifPresent(str->System.out.println(str));
        opt.ifPresentOrElse(str->System.out.println(str), ()->System.out.println("empty"));
        String value =empty.orElse("default value");
        System.out.println(value);
        System.out.println(empty.orElseGet(()->"default lambda value"));
        //empty.orElseThrow(()->new RuntimeException("비어있음"));
        System.out.println("-----filter");
        opt.filter(str->str.length()>=4)
            .ifPresent(str->System.out.println("filter value: "+str));
        System.out.println("-----map");
        opt.map(String::toUpperCase)
            .ifPresent(str->System.out.println(str));
        opt.flatMap(str->Optional.of(str).map(String::toUpperCase))
            .ifPresent(str->System.out.println(str));
        
        System.out.println("-----end");
    }
}
