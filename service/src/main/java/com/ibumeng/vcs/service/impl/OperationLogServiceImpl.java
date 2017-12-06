package com.ibumeng.vcs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ibumeng.vcs.model.entity.OperationLog;
import com.ibumeng.vcs.service.OperationLogService;
import com.ibumeng.vcs.data.repository.BaseRepository;
import com.ibumeng.vcs.data.repository.OperationLogRepository;

@Service("operationLogService")
public class OperationLogServiceImpl extends BaseServiceImpl<OperationLog, Long> implements OperationLogService{

	@Resource( name = "operationLogRepository")
	OperationLogRepository operationLogRepository;
	
		
	@Resource( name = "operationLogRepository")
	@Override
	public void setBaseRepository(BaseRepository<OperationLog, Long> baseRepository) {
		super.setBaseRepository(baseRepository);
	}	

}
