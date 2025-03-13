import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import siat.study.stream.ProductVO;

public class StreamProdAppMain {
    public static void main(String[] args) {
        /*
         요구사항 명세서
         1. 더미데이터 넣어서 ProductVO객체 10개 생성(builder로)
         2. Stream복사
         3. 2025년에 생산된 모든 제품 찾아 출력(오름차순정렬-가격기준)
         4. 생산지가 부산인 곳을 찾아 출력
         5. 제품 가격이 가장 높은 제품 정보 출력
         6. 제품이름을 출력. (오름차순)
         */
        List<ProductVO> productList = Arrays.asList(
        ProductVO.builder().prodName("TV").location("Seoul").prodYear(2025).prodPrice(50000).build(),
        ProductVO.builder().prodName("Laptop").location("Busan").prodYear(2024).prodPrice(120000).build(),
        ProductVO.builder().prodName("Phone").location("Incheon").prodYear(2025).prodPrice(80000).build(),
        ProductVO.builder().prodName("Tablet").location("Busan").prodYear(2025).prodPrice(60000).build(),
        ProductVO.builder().prodName("Camera").location("Seoul").prodYear(2023).prodPrice(70000).build(),
        ProductVO.builder().prodName("Monitor").location("Busan").prodYear(2025).prodPrice(55000).build(),
        ProductVO.builder().prodName("Keyboard").location("Daejeon").prodYear(2022).prodPrice(30000).build(),
        ProductVO.builder().prodName("Mouse").location("Busan").prodYear(2025).prodPrice(20000).build(),
        ProductVO.builder().prodName("Speaker").location("Seoul").prodYear(2021).prodPrice(40000).build(),
        ProductVO.builder().prodName("Headset").location("Gwangju").prodYear(2025).prodPrice(45000).build()
    );
        List<ProductVO> copy=productList.stream().collect(Collectors.toList());
        System.out.println("2025년 생산 제품 (가격 오름차순)");
        productList.stream().filter(p->p.getProdYear()==2025).sorted(Comparator.comparing(ProductVO::getProdPrice)).forEach(System.out::println);
        System.out.println("생산지가 'Busan'인 제품");
        productList.stream().filter(p->"Busan".equals(p.getLocation())).forEach(System.out::println);
        System.out.println("가격이 가장 높은 제품");
        productList.stream().max(Comparator.comparing(ProductVO::getProdPrice)).ifPresent(System.out::println);
        System.out.println("제품 이름 (오름차순)");
        productList.stream().map(ProductVO::getProdName).sorted().forEach(System.out::println);
    }
}
