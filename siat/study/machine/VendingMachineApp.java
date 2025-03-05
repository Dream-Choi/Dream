package siat.study.machine;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class VendingMachineApp {
    public static final int COLA = 2300;
    public static final int WATER=500;
    public static final int VITA500=1200;
    private static int choiceNum;
    private static int inputMoney;

    public void init(String type){
        switch (type) {
            case "if":
                menuIf();                
                break;
            case "switch":
                menuSwitch();
                break;
            default:
                System.out.println("정확한 타입을 입력하세요. 프로그램 종료.");
                System.exit(0);
        }
    }

    public void menuIf(){
        System.out.println(">>>> If ver vending menu <<<<");
        menu();
        
        int price=0;
        if (choiceNum ==1){
            price=COLA;
        }
        else if(choiceNum==2){
            price=WATER;
        }
        else if(choiceNum==3){
            price=VITA500;
        }
        else {
            System.out.println("뭘 원하는 거야? 프로그램 종료.");
            System.exit(0);
        }

        /*
         조건판단 및 잔액반환
         -선택한 메뉴와 금액을 판단
         -잔액은 천원짜리 오백원, 백원으로 나누어서 생각
         -반환금액 출력
         */
        if(inputMoney<price){
            System.out.println("금액 부족");
            System.exit(0);
        }
        int change =inputMoney-price;
        int thousand= change/1000;
        change %=1000;
        int fiveHundred =change/500;
        change %=500;
        int hundred=change/100;
        change %= 100;
        System.out.printf("잔액 반환: 천원 :%d , 오백원 : %d, 백원 : %d \n", thousand,fiveHundred,hundred);
    }
    public void menuSwitch(){
        System.out.println(">>>> Switch ver vending menu <<<<");
        menu();
       
        int price=0;
        switch (choiceNum) {
            case 1:
                price=COLA;
                break;
            case 2:
                price=WATER;
                break;
            case 3:
                price=VITA500;
                break;
            default:
                System.out.println("뭘 원하는 거야? 프로그램 종료.");
                System.exit(0);
        } 
        
        if(inputMoney<price){
                    System.out.println("금액 부족");
                    System.exit(0);
        }
        int change =inputMoney-price;
        int thousand= change/1000;
        change %=1000;
        int fiveHundred =change/500;
        change %=500;
        int hundred=change/100;
        change %= 100;
        System.out.printf("잔액 반환: 천원 :%d , 오백원 : %d, 백원 : %d \n", thousand,fiveHundred,hundred);
    }
    public void menu(){
        System.out.println("메뉴");
        System.out.println("1.Cola(2300) 2.Water(500) 3.Vita500(1200)");
        Scanner scan= new Scanner(System.in);
        System.out.print("원하는 음료번호 입력. : ");
        choiceNum=scan.nextInt();
        System.out.print("투입구에 돈을 넣으시오. : ");
        inputMoney=scan.nextInt();
    }
}
