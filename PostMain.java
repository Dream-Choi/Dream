import service.PostService;
import siat.PostDTO;
import view.PostView;

public class PostMain {
    public static void main(String[] args) {
        // PostDTO p = PostDTO.builder()
        // .title("제목목")
        // .author("몰루")
        // .vieweCnt(44)
        // .build() ;
        // System.out.printf("제목: %S, 글쓴이: %S, 조회수: %d"
        //     , p.getTitle(), p.getAuthor(), p.getVieweCnt());

        // PostView v = PostView.builder().build();
        // v.menu();
        PostService s = PostService.builder().build();
        System.out.println(s.updatePost());
    }
}
