package com.borry.org.service;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.borry.org.model.entity.OperationLog;
import com.borry.org.model.entity.Tests;
import com.borry.org.service.OperationLogService;
import com.borry.org.service.TestsService;







public class UnitServiceTest extends BaseTest {
		
	
	@Autowired
	public OperationLogService operationLogService;
	
	@Autowired
	public TestsService testsService;
	
	
//	@Test
//	public void saveTest() 
//	{
//		for(int i=0; i<3 ; i++)
//		{
//			String r = RandomStringUtils.random(5,true,true).toLowerCase();			
//			
//			Tests o00 = new Tests();		
//			o00.setName(r+"name");
//			o00.setDescription(r+"description");
//			testsService.save(o00);
//			System.out.println(o00.toString());	
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
//		for(int i=0; i<3 ; i++)
//		{
//			String r = RandomStringUtils.random(5,true,true).toLowerCase();	
//			
//			OperationLog o0 = new OperationLog();
//			o0.setModuleType(r+"moduletype");
//			o0.setReqType(r+"reqType");
//			o0.setOperType(r+"operType");
//			o0.setReqUrl(r+"reqUrl");
//			o0.setReferer(r+"referer");
//			o0.setObjectid(r+"objectid");
//			o0.setObjectname(r+"objectname");
//			o0.setUid(0L);
//			o0.setUname(r+"uname");
//			o0.setDescription(r+"description");
//			operationLogService.save(o0);
//			System.out.println(o0.toString());	
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}			
//		}	
		
//	}
	
	
	
	@Test
	public void findAllTest() 
	{
		
		List<Tests> tlist1 = testsService.queryAll();		
		if(tlist1!=null && tlist1.size()>0 ){				
			for(Tests o :tlist1){
				
				System.out.println("queryAlltestsMasterService==="+o.getId()+">>"+o.getName().toString());	
			}
		}
		
		List<Tests> tlist0 = testsService.findAll();		
		if(tlist0!=null && tlist0.size()>0 ){				
			for(Tests o :tlist0){
				
				System.out.println("findAlltestsService==="+o.getId()+">>"+o.getName().toString());	
			}
		}
		
		List<Tests> tlist2 = testsService.findAllByMapper();		
		if(tlist2!=null && tlist2.size()>0 ){				
			for(Tests o :tlist2){
				System.out.println("findAllByMappertestsMapperService==="+o.getId()+">>"+o.getName().toString());	
				
			}
		}  
		
		List<Tests> tlist3 = testsService.queryAllByMapper();		
		if(tlist3!=null && tlist3.size()>0 ){				
			for(Tests o :tlist3){
				System.out.println("queryAllByMappertestsMasterMapperService==="+o.getId()+">>"+o.getName().toString());	
				
			}
		}
		
	}
	
}
