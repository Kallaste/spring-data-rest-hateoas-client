package com.techknowsurfer.springdataresthateoasclient;

import com.techknowsurfer.springdataresthateoasclient.domain.Post;
import com.techknowsurfer.springdataresthateoasclient.services.PostService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PostServiceTest {

    @Autowired  PostService postService;

    @Test
    public void testGetAllPost(){
        PagedResources<Post> postPagedResources = postService.getAllPosts();
        log.info("All Posts {} ",postPagedResources);
    }

    public void testGetPost(){
        Resource<Post> postResource = postService.getPost(1);
        log.info("Post {} ",postResource);
    }

}
