package siat.study.stream;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProductVO {
    private String prodName;
    private String location;
    private int prodYear;
    private int prodPrice;
    @Override
    public String toString(){
        return prodName;
    }
}
