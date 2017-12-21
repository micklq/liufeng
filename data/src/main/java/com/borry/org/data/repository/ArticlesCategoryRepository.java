package com.borry.org.data.repository; 

import javax.annotation.Resource;

import com.borry.org.model.entity.ArticlesCategory;



@Resource(name = "articlesCategoryRepository")
public interface ArticlesCategoryRepository  extends BaseRepository<ArticlesCategory, Long>{

}

