package com.ibumeng.vcs.service;

import java.util.Map;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.ibumeng.vcs.base.Message;
import com.ibumeng.vcs.service.kafka.consumer.BaseConsumer;

@Service
public class TestConsumer extends BaseConsumer {

	private String topic;
	public TestConsumer(String topic){
		this.topic = topic;
	}
	

	final IConsumerMessageHandler handler = new IConsumerMessageHandler() {
		@Override
		public void onMessage(Message msg) {
			
			Map<String, Object> d = msg.getDataMap();
			
			Object currentTimeMillis = d.get("currentTimeMillis");

			System.out.println(String.format("%s get from [%s]:%s", this.getClass().getName(), topic, currentTimeMillis));
		}
	};

	@Override
	public String getTopic() {
		return topic;
	}

	@Override
	public IConsumerMessageHandler getConsumerMessageHandler() {
		return handler;
	}

	@Override
	public Logger getLogger() {
		return null;
	}


}
