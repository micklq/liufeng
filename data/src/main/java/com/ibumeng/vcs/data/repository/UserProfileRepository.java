package com.ibumeng.vcs.data.repository;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.Query;

import com.ibumeng.vcs.model.entity.UserProfile;

/**
 * Created by mick on 12/19/2017.
 */
@Resource(name = "userProfileRepository")
public interface UserProfileRepository extends BaseRepository<UserProfile, Long> {

    
}
