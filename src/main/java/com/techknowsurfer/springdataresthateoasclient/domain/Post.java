package com.techknowsurfer.springdataresthateoasclient.domain;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post {

    Long postId;

    String content;

    String articleTitle;

    Boolean status;

    String authorId;
}
