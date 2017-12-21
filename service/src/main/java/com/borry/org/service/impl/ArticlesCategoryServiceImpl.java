package com.borry.org.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import com.borry.org.data.repository.BaseRepository;
import com.borry.org.model.entity.ArticlesCategory;
import com.borry.org.data.mapper.ArticlesCategoryDAO;
import com.borry.org.data.repository.ArticlesCategoryRepository;
import com.borry.org.service.ArticlesCategoryService;

  
@Service("articlesCategoryService")
public class ArticlesCategoryServiceImpl extends BaseServiceImpl<ArticlesCategory, Long> implements ArticlesCategoryService {

	@Resource(name = "articlesCategoryRepository")
	private ArticlesCategoryRepository articlesCategoryRepository;

	@Autowired
	private ArticlesCategoryDAO articlesCategoryDAO;

	@Resource(name = "articlesCategoryRepository")
	@Override
	public void setBaseRepository(BaseRepository<ArticlesCategory, Long> baseRepository){

		   super.setBaseRepository(baseRepository);
    }



}

