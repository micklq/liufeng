package com.ibumeng.vcs.data.repository;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.Query;

import com.ibumeng.vcs.model.entity.Tests;



/**
 * Created by djyin on 7/19/2014.
 */
@Resource(name = "testsRepository")
public interface TestsRepository extends BaseRepository<Tests, Long> {
    
}
