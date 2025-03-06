import siat.study.PostDTO;
import siat.study.post.dao.PostDAO;
import siat.study.post.domain.PostResponseDTO;
import siat.study.post.domain.PostRequestDTO;

public class AryMain {
    public static void main(String[] args) {
        /*
         배열(array)
         -[]
         -고정길이를 갖음
         -단일 타입만 받음
         -리사이징x
         -length
         -참조타입으로 취급
         */
        /* 
        int[] array=new int[10];
        System.out.println("배열의 길이:"+array.length);
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println(">>>>enhanced loop");
        for (int data:array){
            System.out.println(data);
        }

        System.out.println("참조타입의 객체를 배열에 담는다면?");
        PostDTO dto = PostDTO.builder().title("제목").author("jslim").regDate("몰라").content("쉬는 시간").viewCnt(0).build();

        PostDTO [] dtoAry =new PostDTO[10];
        dtoAry[0]=dto;
        dtoAry[1]=dto;
        dtoAry[2]=dto;

        for(PostDTO entity:dtoAry){
            if(entity!=null){
                System.out.println(entity.getTitle());
            }
        }
        */
        PostDAO obj = PostDAO.builder().build();
        PostResponseDTO [] responseAry= obj.selectRow();
        System.out.println("게시글 출력");
        for(PostResponseDTO entity:responseAry){
            System.out.println(entity);
        }
        
    }
}
