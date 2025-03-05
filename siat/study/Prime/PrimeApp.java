package siat.study.Prime;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class PrimeApp {
    /*
     소수란 1과 자기 자신으로만 나눌수 있는 수
     -판단로직(for, if)
     0, 1은 소수가 아니다
     어떤 숫자가 소수인지 판단하려면 2~입력된 숫자까지 나뉜 후, 나머지가 0인 경우가 한 번도 없어야 함.
     그러면 소수
     즉, n보다 작은 자연수들로 나뉘는 수
     */
    public String primeNumber(){
        System.out.println("숫자입력:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number ==1 || number==0) {
            System.out.println("0, 1은 아니다");
            System.exit(0);
        }
        for (int i=2; i<number;i++){
            if (number%i==0){
                System.out.println("소수아님.");
                System.exit(0);
            }
        }
        System.out.println("소수임");
        return null;
    }
}
