package siat.study.post.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import siat.study.post.domain.PostRequestDTO;
import siat.study.post.domain.PostResponseDTO;

// DAO는 Data Access Object)의 약자로 DBMS와 작업을 전담하는 역할
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class PostDAO {
    private PostRequestDTO[] requestAry=new PostRequestDTO[10];
    private int i;
    public void insertRow(PostRequestDTO request){
        requestAry[i++]=request;
    }
    public PostRequestDTO[] selectRow(){
     return requestAry;

        }
    }

