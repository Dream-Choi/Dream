package siat.study.control;

public class ControlApp {
    /*
     조건식 
     A 또는 B를 행위를 기대할 수 있는 것
    switch(값){
        case 값 :
            구현
            break;
        default: 구현
    }
     */
    public String woodMan(int number){
        String msg = null;
        if (number >=1 && number <=3){
            if(number==1){
                msg="you lie";
            }
            else if (number==2){
                msg="you lie again";
            }
            else if (number==3){
                msg="how honest you are";
            }
            System.out.println("산신령이 연못으로 사라졌다.");
        }else{
            msg="you die";
        }
        return msg;
    }

        public String woodMan2(int number){
            String msg = null;
            if (number >=1 && number <=3){
                System.out.println("he appears");
                switch (number) {
                    case 1:
                        msg="you lie";
                        break;
                    case 2:
                        msg="you lie again";
                        break;
                    case 3:
                        msg="how honest you are";
                        break;
                    default:
                        break;
                }
                System.out.println("산신령이 연못으로 사라졌다.");
            }else{
                msg="you die";
            }
            return msg;
        }
    
        public String passOrNonpass(int kor, int eng, int math){
            String result=null;
            double avg = (kor+eng+math)/3;
            if (kor>=40 && eng >=40 && math >=40&&avg >=60){
                result= "pass";
            }
            else{
                if(avg<60){
                result= "평균미달로 불합격";
            }
                if (kor<40) {
                    result="국어미달로 불합격";
                }
                if (eng<40){
                    result="영어미달로 불합격";
                }
                if (math<40){
                    result ="수학미달로 불합격";
                }
            }
            return result;
        }

        //사칙연산 메서드 정의
        // +,-,*,/
        public double calc(int x, char oper, int y){
            double result=0.0;
            switch (oper) {
                case '+':
                    result =x+y;
                    break;
                case '-':
                    result =x-y;
                    break;
                case '*':
                    result =x*y;
                    break;
                case '/':
                    result =x/y;
                    break;
                default:
                    break;
            }
            return result;
        }
    }    

