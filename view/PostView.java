package view;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostView {
    private String url;

    public void menu() {
        System.out.println("UI 실행됨");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        System.out.println("당신이 입력한 정수 : " + userInput);
    }
}
