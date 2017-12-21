package com.borry.org.data.repository; 

import javax.annotation.Resource;

import com.borry.org.model.entity.Articles;



@Resource(name = "articlesRepository")
public interface ArticlesRepository  extends BaseRepository<Articles, Long>{

}

