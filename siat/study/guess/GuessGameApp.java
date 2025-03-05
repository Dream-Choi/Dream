package siat.study.guess;

import java.util.Scanner;

import lombok.Builder;

@Builder
public class GuessGameApp {
    public static int n;
    public static int generatorNan(){
        int answer=(int)(Math.random() *100)+1;
        return answer;
    }
    /*
     기회 10번
     -매개변수로 정답을 받고
     반환값으로
     --성공)xx번째 맟춤.
     --실패)기회소진
     */
    public void gameFor(int answer){
        
        int x=0;
        for(int i=0;i<11;i++){
            Scanner scan = new Scanner(System.in);
            n=scan.nextInt();
            x++;
            if (n>answer){
                System.out.println("down");
            } else if (n<answer){
                System.out.println("up");
            } else if (n==answer){
                System.out.println(x+"번만에 정답 맞춤.");
                break;
            }
            if (x>10){
                System.out.println("기회 초과");
                break;
            }
        }
    }
    public void gameWhile(int answer){
        int x=0;
        while (x<11) {
            Scanner scan = new Scanner(System.in);
            n=scan.nextInt();
            x++;
            if (n>answer){
                System.out.println("down");
            } else if (n<answer){
                System.out.println("up");
            } else if (n==answer){
                System.out.println(x+"번만에 정답 맞춤.");
                break;
            }
            if (x>9){
                System.out.println("기회 초과");
                break;
            }
        }
    }
    public void gameDoWhile(int answer){
        int x=0;
        do{
            Scanner scan = new Scanner(System.in);
            n=scan.nextInt();
            x++;
            if (n>answer){
                System.out.println("down");
            } else if (n<answer){
                System.out.println("up");
            } else if (n==answer){
                System.out.println(x+"번만에 정답 맞춤.");
                break;
            }
            if (x>9){
                System.out.println("기회 초과");
                break;
        }
    }while(x<11);
}
}