package com.borry.org.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borry.org.model.entity.Department;





public class DemoTest  {		
	
	

//	@SuppressWarnings({ "null", "unused" })
//	@Test
//	public void splitTest() 
//	{
//			String str ="1,2,3,4,5,6";
//			String[] ary = str.split(",");
//			ArrayList<Long> result = new ArrayList<Long>();
//			System.out.println("arylen:"+ary.length);
//			if(ary.length>0){
//				
//				for(int i=0; i<ary.length; i++){
//					
//					Long oo = Long.parseLong(ary[i]);
//					if(oo!=null&&oo>0)
//					{
//						System.out.println("oo1:"+oo);						
//						result.add(oo);
//					}
//			}
//			}
//			if(result.size()>0)
//			{
//				
//				for(Long o :result){
//					
//					System.out.println(o);
//				}
//				
//				
//			}		    
//		
//	}
	
//	@Test
//	public void modelTest() 
//	{
//		int dataCount =12;
//		int dataPage = (int) (12/12);
//		System.out.println("dataPage:" +dataPage);
//		if(dataCount%12==0){
//			System.out.println("dataCount:" +dataCount);
//			dataPage= dataPage-1; //分页整除 减一 以下再加一
//		}
//		System.out.println("dataPage:" +dataPage);
//	}
	
	
	
	@Test
	public void recursionTest() 
	{
		List<Department> list = new ArrayList<Department>();
		Department d1 =new Department();
		d1.setId(1L);
		d1.setParentId(0);
		d1.setName("中国");
		list.add(d1);
		
		Department d2 =new Department();
		d2.setId(2L);
		d2.setParentId(1L);
		d2.setName("广东");
		list.add(d2);
		
		Department d3 =new Department();
		d3.setId(3L);
		d3.setParentId(2L);
		d3.setName("深圳");
		list.add(d3);
		
		Department d4 =new Department();
		d4.setId(4L);
		d4.setParentId(1L);
		d4.setName("湖南");
		list.add(d4);
		
		Department d5 =new Department();
		d5.setId(5L);
		d5.setParentId(4L);
		d5.setName("长沙");
		list.add(d5);
		

		
//		for(long i=1; i<5; i++){
//			Department d1 =new Department();
//			d1.setId(i);
//			d1.setParentId(0);
//			list.add(d1);
//			for(long j=1; j<5; j++){
//				Department d2 =new Department();
//				d2.setId((i+j+4));
//				d2.setParentId(i);
//				list.add(d2);
//				
//				for(long jj=1; jj<5; jj++){
//					Department d3 =new Department();
//					d3.setId(i+j+jj+4+4);
//					d3.setParentId(j);
//					list.add(d3);
//				}
//				
//			}
//		}
		
//		for(Department oo :list){
//			
//			System.out.println("id:"+oo.getId()+"======pid:"+oo.getParentId());
//		}
		
		
		recursion(list);
	}
	
	private void recursion(List<Department> list)
	{	
		
//		for(Department o :list){
//			
//			if(o.getParentId()==0){
//				
//				System.out.println("rid:" + o.getId() + "=<<"+o.getName()+">>=rpid:" + o.getParentId());
//			}
//			else{
				
				recursion1(list,0);
//			}		
//		}
		
	}
	
	private void recursion1(List<Department> list ,long pid){
		for(Department o :list){
			if(o.getParentId()==pid ){
				System.out.println("rrid:" + o.getId() + "=<<s"+o.getName()+"s>>=rrpid:" + o.getParentId());
				
				recursion1(list ,o.getId());
			}			
		}
	}

}
