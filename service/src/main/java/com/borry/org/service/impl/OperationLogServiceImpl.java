package com.borry.org.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.borry.org.data.repository.BaseRepository;
import com.borry.org.data.repository.OperationLogRepository;
import com.borry.org.model.entity.OperationLog;
import com.borry.org.service.OperationLogService;

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
