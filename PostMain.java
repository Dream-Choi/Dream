import siat.study.PostDTO;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostRequestDTO;
import siat.study.service.PostService;
import siat.study.view.PostView;

public class PostMain {
    public static void main(String[] args) {
        // PostDTO p = PostDTO.builder()
        // .title("제목목")
        // .author("몰루")
        // .viewCnt(44)
        // .build() ;
        // System.out.printf("제목: %S, 글쓴이: %S, 조회수: %d"
        //     , p.getTitle(), p.getAuthor(), p.getViewCnt());

        PostView v = PostView.builder().dao(PostDAO.builder().requestAry(new PostRequestDTO[10]).build()).build();
        v.menu();
        PostService s = PostService.builder().build();
        System.out.println(s.updatePost());
    }
}
