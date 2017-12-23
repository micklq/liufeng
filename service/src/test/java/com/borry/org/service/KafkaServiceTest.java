package com.borry.org.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;







import com.borry.org.base.Action;
import com.borry.org.base.Message;
import com.borry.org.service.kafka.producer.KafkaProducer;
import com.borry.org.service.kafka.producer.KafkaProducerString;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import kafka.javaapi.producer.Producer;




public class KafkaServiceTest extends BaseTest {		
	
	
	
	@Autowired
	public KafkaProducerString KafkaProducerStr;	
	@Autowired
	public KafkaProducer KafkaProducer;	
	
	@Test
	public void KafkaProducerTest() 
	{
//		Map<String, Object> data = new HashMap<String, Object>();		
//		data.put("S301","张三");
//		Message message = new Message();
//		message.setAction(Action.UPDATE);
//		message.setDataMap(data);		
//		KafkaProducer.send("test",data);		
		
	//	KafkaProducerStr.send("test","test1-string-"+ System.currentTimeMillis());
		
	}
	
	
	
	

	
	
}
