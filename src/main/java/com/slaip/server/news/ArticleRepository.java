package com.slaip.server.news;

import com.slaip.server.news.model.api.media.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
