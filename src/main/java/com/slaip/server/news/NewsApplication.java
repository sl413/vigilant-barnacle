package com.slaip.server.news;


import com.slaip.server.news.model.api.media.Article;
import com.slaip.server.news.model.api.media.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class NewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsApplication.class, args);
    }

}

@RestController
class ConnectionController {

    @Autowired
    public ArticleRepository articleRepository;

    @GetMapping("/")
    public ResponseModel getArticles() {
        ResponseModel resp = new ResponseModel();
        List<Article> articles = new ArrayList<>();
        articleRepository.findAll().forEach(articles::add);
        resp.setArticles(articles);
        return resp;
    }
}
