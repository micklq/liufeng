package com.ibumeng.vcs.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) // 整合 
@ContextConfiguration(locations="classpath:applicationContext-service.xml") // 加载配置
public class BaseTest {
	
	@Test
	public void test() {
     //fail("Not yet implemented");
		System.out.println("com.ibumeng.vcs.service basetest test run!!!");
	}

}
