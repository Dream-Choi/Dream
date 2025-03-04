package siat.study.loop;

import lombok.Builder;

/*
 반복구문(for, while, do ~ while)
 - for:반복횟수가 정의되어 있을 때
 - while, do ~ while: 반복횟수가 정의되어있는 것이 아니라 어떤 상황이 올 때 까지 정의
 - while은 반복되지 않을 수 있음
 - do ~ while은 무조건 한번은 반복
 - break, continue


 for)
 for(초기식;조건식;증감식){
 }
 while)
 초기식
 while(조건식){
 증감식
 }
 do ~ while)
 초기식
 do{
 증감식
 }while(조건식)
 */
@Builder
public class LoopApp {
    public int sumOneToTen(){
        int sum =0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        return sum;
    }
    public int sumStartToEnd(int x, int y){
        int s=0;
        for(int i=x; i<=y;i++){
            s+=i;
        }
        return s;
    }
}
