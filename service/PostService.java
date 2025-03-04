package service;

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
public class PostService {
    private String url;

    public String savePost() {
        return "저장됨!";
    }

    public String updatePost() {
        return "수정됨";
    }
}
