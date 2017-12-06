package com.ibumeng.vcs.data.repository;

import java.util.List;

import javax.annotation.Resource;

import com.ibumeng.vcs.model.entity.OperationLog;

/**
 * Created by djyin on 7/19/2014.
 */
@Resource(name = "operationLogRepository")
public interface OperationLogRepository extends BaseRepository<OperationLog, Long> {
	
}
