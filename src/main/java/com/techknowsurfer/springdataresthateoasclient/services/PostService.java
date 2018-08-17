package com.techknowsurfer.springdataresthateoasclient.services;

import com.techknowsurfer.springdataresthateoasclient.domain.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PostService {
    private final RestTemplate restTemplate;

    public PagedResources<Post> getAllPosts(){
        try {

            ResponseEntity<PagedResources<Post>> responseEntity = restTemplate.exchange("http://localhost:8080/blogs/", HttpMethod.GET,null,
                    new ParameterizedTypeReference< PagedResources<Post>>(){});
            if(responseEntity.getStatusCode() == HttpStatus.OK){
                return responseEntity.getBody();
            }
            return null;
        } catch (HttpClientErrorException | HttpServerErrorException e){
            throw e;
        }
    }
    public Resource<Post> getPost(int postId){
        try {
            ResponseEntity<Resource<Post>> responseEntity = restTemplate.exchange("http://localhost:8080/blogs/"+postId, HttpMethod.GET,null,
                    new ParameterizedTypeReference< Resource<Post>>(){});
            if(responseEntity.getStatusCode() == HttpStatus.OK){
                return responseEntity.getBody();
            }
            return null;
        } catch (HttpClientErrorException | HttpServerErrorException e){
            throw e;
        }
    }
}
