package org.example.book.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.book.domain.posts.Posts;
@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {


    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;

    }

}
