package com.borry.org.data.repository;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.Query;

import com.borry.org.model.entity.UserPassport;


/**
 * Created by mick on 12/19/2017.
 */
@Resource(name = "userPassportRepository")
public interface UserPassportRepository extends BaseRepository<UserPassport, Long> {

    
}
