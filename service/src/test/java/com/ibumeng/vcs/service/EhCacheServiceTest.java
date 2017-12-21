package com.ibumeng.vcs.service;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.borry.org.model.entity.OperationLog;
import com.borry.org.model.entity.Tests;
import com.borry.org.service.EhCacheTestService;







public class EhCacheServiceTest extends BaseTest {
		
	@Autowired  
    private EhCacheTestService ehCacheTestService;

	@Test  
    public void getTimestampTest() throws InterruptedException{  
        System.out.println("第一次调用==>>" + ehCacheTestService.getTimestamp("param")); 
        Thread.sleep(2000); 
        System.out.println("2秒之后调用==>>" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(10000);
        System.out.println("再过10秒之后调用：" + ehCacheTestService.getTimestamp("param"));
        
        System.out.println("第一次调用：" + ehCacheTestService.getTimestamp("param1"));
        Thread.sleep(2000);
        System.out.println("2秒之后调用：" + ehCacheTestService.getTimestamp("param1"));
        Thread.sleep(10000);
        System.out.println("再过10秒之后调用：" + ehCacheTestService.getTimestamp("param1"));
    } 
	


	
	
	
	

	
	
}
