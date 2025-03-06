package siat.study.view;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostRequestDTO;
import siat.study.post.domain.PostResponseDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostView {
    private PostDAO dao;
    private String url;

    public void menu() {
        while(true){
        System.out.println("UI 실행됨");
        System.out.println("1. 게시글 등록");
        System.out.println("2. 게시글 목록");
        System.out.println("99. 프로그램 종료");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        System.out.println("당신이 입력한 정수 : " + userInput);
        switch (userInput) {
            case 1:
                register();
                break;
            case 2:
                select();
                break;
            case 99:
                exit();
                break;
        }
    }
}
    public void select(){
        PostRequestDTO [] requestAry= dao.selectRow();
        System.out.println("게시글 출력");
        for(PostRequestDTO entity:requestAry){
            if (entity!=null){
            System.out.println(entity);
        }
    }
}
    public void exit(){
        System.exit(0);
    }
    public void register(){
        Scanner scan =new Scanner(System.in);
        System.out.print("제목:");
        String title = scan.nextLine();
        System.out.print("내용:");
        String content =scan.nextLine();
        System.out.print("작성자");
        String writer=scan.nextLine();
        //입력테이터를 PostRequestDTO에 담고 DAO에 전달
        PostRequestDTO request= PostRequestDTO.builder()
                                .title(title)
                                .content(content)
                                .writer(writer)
                                .build();
        dao.insertRow(request);
    }
}