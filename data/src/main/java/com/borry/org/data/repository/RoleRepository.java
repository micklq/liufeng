package com.borry.org.data.repository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.Query;

import com.borry.org.model.entity.Role;

/**
 * Created by mick on 12/19/2017.
 */
@Resource(name = "roleRepository")
public interface RoleRepository extends BaseRepository<Role, Long> {
		
}
