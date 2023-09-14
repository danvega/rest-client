package dev.danvega.restclient.client;

import dev.danvega.restclient.post.Post;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface JsonPlaceholderService {

    @GetExchange("/posts")
    List<Post> findAll();

    @GetExchange("/posts/{id}")
    Post findById(@PathVariable("id") Integer id);

    @PostExchange("/posts")
    Post create(@RequestBody Post post);

    @PutExchange("/posts/{id}")
    Post update(@PathVariable("id") Integer id, @RequestBody Post post);

    @DeleteMapping("/posts/{id}")
    void delete(@PathVariable("id") Integer id);

}
