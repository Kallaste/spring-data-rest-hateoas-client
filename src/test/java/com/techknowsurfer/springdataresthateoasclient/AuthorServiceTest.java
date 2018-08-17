package com.techknowsurfer.springdataresthateoasclient;

import com.techknowsurfer.springdataresthateoasclient.domain.Author;
import com.techknowsurfer.springdataresthateoasclient.services.AuthorService;
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
public class AuthorServiceTest {

	@Autowired AuthorService authorService;

	@Test
	public void getAuthor_success() {
		Resource<Author> author =  authorService.getAuthor(1);
		log.info("Author {} ",author);
	}

	@Test
	public void getAllAuthor_success() {
		PagedResources<Author> authorList =  authorService.getAllAuthors();
		log.info("Author {} ",authorList);
	}
}
