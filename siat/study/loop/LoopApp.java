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
    public String sumStartToEnd(int x, int y){
        int s=0;
        for(int i=x; i<=y;i++){
            s+=i;
        }
        return x+"~"+y+"까지 합은"+s;
    }
    //sumStartToEnd -> while, do~ while구문으로 변경
    public String sumStartToEndWhile(int x, int y){
        int s=0;
        int i=x;
        while (i<=y) {
            s+=i;
            i++;
        }
        return x+"~"+y+"까지 합은"+s;
    }
    public String sumStartToEndDoWhile(int x, int y){
        int s =0;
        int i=x;
        do {
            s+=i;
            i++;
        }while(i<=y);
        return x+"~"+y+"까지 합은"+s;
    }
    //매개변수로 입력받은 값을 1부터 차례로 누적하여 합 구하다가 입력받은 값을 넘으면 중단하고 마지막으로 더해진 값과 그때까지 합을 출력하고 싶다.
    public void loopBreak(int number) {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (sum > number) {
                break;
            }
            i++;
        }
        System.out.println("마지막으로 더해진 값: " + i + ", 그때까지 합: " + sum);
    }
    public void gugudanRow(){
        for (int dan=2; dan<=9;dan++){
            gugudanCol(dan);
        }
    }
    private void gugudanCol(int dan){
        for (int col=1;col<=9;col++){
            System.out.printf("%d * %d = %d\t", dan,col,(dan*col));
        }
        System.out.println();
    }
    public void gugudanTables(){
        for(int dan=2;dan<=9;dan++){
            for(int col = 1;col<=9;col++){
                System.out.printf("%d * %d = %d\t",dan,col,(dan*col));
            }
            System.out.println();
        }
    }
    public void randomSum(){
        int sum=0;
        int randInt = (int)(Math.random()*100+1);
        for (int i=1; i<=randInt;i++){
            sum+=i;
            if(sum>randInt){
                System.out.println(i+" "+sum);
                break;
            }
        }
    }
    public void popStr(String text){
        for(int i=0;i<text.length();i++){
            System.out.println(text.charAt(i));
        }
    }
    public void printIJ(){
        for(int i=1;i<=5;i++){
            for(int j =1; j<=5;j++){
                System.out.print(i+j);
            }
            System.out.println();
        }
    }    
}