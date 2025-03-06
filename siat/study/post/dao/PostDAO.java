package siat.study.post.dao;

import lombok.Builder;
import siat.study.post.domain.PostResponseDTO;

// DAO는 Data Access Object)의 약자로 DBMS와 작업을 전담하는 역할
@Builder
public class PostDAO {
    public PostResponseDTO[] selectRow(){
        PostResponseDTO entity = PostResponseDTO.builder()
        .title("제목")
        .writer("jslim")
        .content("뻥이야")
        .viewCnt(0)
        .build();
        PostResponseDTO[] ary= new PostResponseDTO[10];
        ary[0]=entity;
        ary[1]=entity;
        return ary;
    }
}
