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
		
		Department d31 =new Department();
		d31.setId(6L);
		d31.setParentId(2L);
		d31.setName("广州");
		list.add(d31);
		
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
		Department d51 =new Department();
		d51.setId(7L);
		d51.setParentId(4L);
		d51.setName("武汉");
		list.add(d51);		
		
		List<Department> result = getTree(list);
		
		for(Department o :result){
			
			System.out.println("rrid:" + o.getId() + "=<<s"+o.getName()+"s>>=rrpid:" + o.getParentId() + "==>depth:"+o.getDepth());
		}
	}
	
	
private List<Department> getTree(List<Department> list){		
	List<Department> result = new  ArrayList<Department>();		
	 recursion(list,0,0,result);	  
	 return result;
 }
	
	private void recursion(List<Department> source ,long pid,int depth,List<Department> result){
		
		for(Department o :source){
			if(o.getParentId()==pid ){
				o.setDepth(depth+1);				
				result.add(o);
				recursion(source ,o.getId(),(int)o.getDepth(),result);
			}			
		}
	}

}
