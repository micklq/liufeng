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
import com.borry.org.model.entity.Articles;
import com.borry.org.data.mapper.ArticlesDAO;
import com.borry.org.data.repository.ArticlesRepository;
import com.borry.org.service.ArticlesService;

  
@Service("articlesService")
public class ArticlesServiceImpl extends BaseServiceImpl<Articles, Long> implements ArticlesService {

	@Resource(name = "articlesRepository")
	private ArticlesRepository articlesRepository;

	@Autowired
	private ArticlesDAO articlesDAO;

	@Resource(name = "articlesRepository")
	@Override
	public void setBaseRepository(BaseRepository<Articles, Long> baseRepository){

		   super.setBaseRepository(baseRepository);
    }



}

