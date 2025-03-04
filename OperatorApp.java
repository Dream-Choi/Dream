public class OperatorApp {
    // 객체생성시 전역(멤버)변수의 초기화 도와주는 역할
    public OperatorApp(){

    }
    //반환값 x, 매개변수 x
    public void example01(){
        System.out.println("산술연산자+,-,*,/,%");
        int x=100, y=100, result=0;
        System.out.println("+"+(x+y));
        System.out.println("-"+(x-y));
        System.out.println("*"+(x*y));
        System.out.println("/"+(x/y));
        System.out.println("%"+(x%y));
        System.out.println("증감연산자++, --");
        System.out.println("++"+ (++x));
        int number =20;
        result= (++number)+3;
        System.out.println("result="+result);
        System.out.println("삼항연산자");
        String strMsg= (number>0)? "양수":(number==0)? "0":"음수";
        System.out.println("result="+strMsg);
        System.out.println("논리연산자 &,|,!, &&, ||");
        System.out.println("관계연산자 >, >=, <,<=,==,!=");
    }
    // 반환값 String 매개변수 두개 입력
    public String example02(String str01, String str02){
        return str01+"\t"+str02;
    }
    //반환값은 문자열, 매개변수는 정수값 하나 입력받아서 홀수인지 짝수인지 구별하기
    public String example03(int m){
        String s=(m%2==0)?"짝수":"홀수";
        return s;
    }
    //반환값은 boolean, 매개변수는 정수값 하나 입력받아서 1~100 사이인지 판단하기
    public boolean example04(int x){
        boolean isFlag= (x>0)&(x<101)? true:false;
        return isFlag;
    }

}
